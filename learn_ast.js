
//读取代码
const fs = require("fs")
//解析代码
const parser = require("@babel/parser")
//将ast代码转换成js代码
const generator = require("@babel/generator").default
//对ast进行操作
const traverse = require("@babel/traverse").default
//构造ast节点的方法
const types = require("@babel/types")


//读取混淆的js
const code = fs.readFileSync("ast_demo.js",{"encoding":"utf-8"})
//将js转换ast
const ast = parser.parse(code)
//处理ast
const visitor = {
    "FunctionDeclaration":{
        enter(path) {
            console.log("FunctionDeclaration",path.toString())
            console.log("------------------------------------------")
        }
    },
    "BinaryExpression":function(path) {
        //修改path中operator的值
        path.node.operator = "-"
    },
    "VariableDeclarator":function(path){
        //从path中取出id和init
        let {id,init} = path.node
        let name = id.name
        if(name === "d"){
            return
        }
        if(!types.isNumericLiteral(init)){
            return
        }
        let value = init.value + ""
        //对节点属性进行改变
        // path.node.init.type = "StringLiteral"
        //也可以对节点属性进行替换
        //获取init_path的路径
        let init_path = path.get('init')
        //只有path才有replaceInline
        init_path.replaceInline(types.stringLiteral(value))
    }
}

traverse(ast,visitor)
//将处理好的ast转成js
const output_code = generator(ast).code
//将新的js写入本地
fs.writeFileSync("output_code.js",output_code,{"encoding":"utf-8"})
