from hashlib import sha256

h = sha256()

h.update(b'python1990K00L')

hash = h.hexdigest()

print(hash)

# 결과값
# d1e8a70b5ccab1dc2f56bbf7e99f064a660c08e361a35751b9c483c88943d082