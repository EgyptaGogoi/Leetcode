
class Solution:
    def fillColour(self, image: List[List[int]], sr: int, sc: int, r: int, c: int, oldC: int, colour: int):
        if image[sr][sc] != oldC:
            return
        image[sr][sc] = colour
        mr = sr
        if 0<= mr-1 < r:
            mr-=1
            self.fillColour(image, mr, sc, r, c, oldC, colour)
        mr = sr
        if 0<= mr+1 < r:
            mr+=1
            self.fillColour(image, mr, sc, r, c, oldC, colour)
        mc = sc
        if 0<= mc-1 < c:
            mc-=1
            self.fillColour(image, sr, mc, r, c, oldC, colour)
        mc = sc
        if 0<= mc+1 < c:
            mc+=1
            self.fillColour(image, sr, mc, r, c, oldC, colour)
    
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if image[sr][sc] == color:
            return image
        c = len(image[0])
        r = len(image)
        old_col = image[sr][sc]
        self.fillColour(image, sr, sc, r, c, old_col, color)
        return image
        