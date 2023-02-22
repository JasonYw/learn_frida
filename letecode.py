class Solution:
    def maximalSquare(self, matrix) -> int:
        x_n = len(matrix)
        y_n = len(matrix[0])

        def isallone(x,y,n):
            for i in range(1,n+1,1):
                if matrix[x+i][y] == "0":
                    return False
                for j in range(1,n+1,1):
                    if matrix[x][y+j] == "0":
                        return False
                    if matrix[x+i][y+j] == "0":
                        return False
            return True


        def test(x,y):
            if x >= x_n or y >= y_n:
                return 0
            else:
                if matrix[x][y] == "0":
                    result = 0
                else:
                    result = 1
                    for i in range(1,max(x_n,y_n)):
                        if x+i >= x_n or y+i >= y_n:
                            break
                        if isallone(x,y,i):
                            result = pow(i+1,2)
                            if result == 4:
                                print(x,y,i)
                        else:
                            break
                p1 = test(x+1,y)
                p2 = test(x,y+1)
                return max(result,max(p1,p2))
        
        return test(0,0)

if __name__ == "__main__":
    matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
    def isallone(x,y,n):
        for i in range(1,n+1,1):
            if matrix[x+i][y] == "0":
                return False
            for j in range(1,n+1,1):
                if matrix[x][y+j] == "0":
                    return False
                if matrix[x][y+j] == "0":
                    return False
        return True
    
    print(Solution().maximalSquare(matrix))