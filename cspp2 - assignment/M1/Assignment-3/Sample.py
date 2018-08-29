if __name__ == '__main__':
    arr=[]
    n = int(input())
    arr = input().split()
    zes =  list(set(map(int, arr)))
    large = max(zes)
    zes.remove(max(zes))
    print(zes)
    print(max(zes))