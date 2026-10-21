
class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        i = 0  # child index
        j = 0  # cookie index

        while i < len(g) and j < len(s):
            if s[j] >= g[i]:
                i += 1  # satisfy this child
            j += 1  # use this cookie

        return i
