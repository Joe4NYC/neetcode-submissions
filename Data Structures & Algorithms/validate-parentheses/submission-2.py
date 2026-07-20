class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')': '(', ']': '[', '}': '{'}
        for c in s:
            if c in pairs:
                expected = pairs[c]
                if not stack: return False
                top = stack.pop()
                if top != expected: return False
            else:
                stack.append(c)
        
        return True if not stack else False