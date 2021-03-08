# Dijkstra
start = costs[0][0]
d = [sys.maxsize for i in range(n)]
d[start] = 0
pq = [(start,0)]

while len(pq) > 0:
    top = pq.pop(0)
    current = top[0]
    distance = top[1]
    if d[current] < distance:
        continue;
    for i in graph[current]:
        nextIs = i[0]
        nextDist = distance + i[1]
        if d[nextIs] > nextDist:
            d[nextIs] = nextDist
            pq.append((nextIs,nextDist))
