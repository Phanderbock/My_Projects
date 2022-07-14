def sortedSquaredArray(array):
    newarray = []
    for number in array:
        newarray.append(number*number)
    newarray.sort()
    return newarray
