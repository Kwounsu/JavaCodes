# import numpy as np

def solution(clothes):
    answer = 0
    # Count each categories
    category = {}
    for a in clothes:
        if(a[1] in category):
            category[a[1]] = category[a[1]]+1
        else:
            category[a[1]] = 1

    if len(category) > 1:
        # Convert category dict to the list
        numOfClothes = []
        for b in category:
            numOfClothes.append(category[b])
        # Get binary list
        numOfCombination = 2**len(numOfClothes)
        binaryList = []
        for i in range(1,numOfCombination):
            binary = []
            for j in bin(i)[2:]:
                binary.append(int(j))
            while len(binary) < len(numOfClothes):
                binary.insert(0,0)
            binaryList.append(binary)
        # Multiply category list and binary list
        for i in binaryList:
            multiplied = list(map(lambda x, y: x * y, numOfClothes, i))
#             multiplied = np.array(numOfClothes)*np.array(i)
#             multiplied = list([int(x) for x in multiplied])
            comb = 1
            for j in multiplied:
                if j > 0:
                    comb *= j
            answer += comb
    else:
        answer = len(clothes)
    return answer

if __name__ == '__main__':
    n = [["a", "1"], ["b", "1"], ["c", "1"], ["d", "2"], ["e", "2"], ["f", "3"], ["g", "3"]]
    print(solution(n))
