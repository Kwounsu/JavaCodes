def print_rangoli(n):
    l=[]
    for i in range(n*2-1):
        subList = []
        for j in range(4*n-3):
            subList.append('-')
        l.append(subList)

    mid = n+(n-1)-1
    first = 0
    last = mid

    for i in range(n):
        if first != last:
            for j in range(mid-first*2,mid+first*2+1,2):
                l[first][j] = chr(97+(last*2+abs(mid-j))//2-n+1)
                l[last][j] = chr(97+(last*2+abs(mid-j))//2-n+1)
            first += 1
            last -= 1
        else:
            for j in range(0,(4*n-3),2):
                l[first][j] = chr(97+(last*2+abs(mid-j))//2-n+1)

    for i in l:
        for j in i:
            print(j,end='')
        print()


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
