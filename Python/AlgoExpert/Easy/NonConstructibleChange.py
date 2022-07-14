def nonConstructibleChange(coins):
    maxChange = 0
    coins.sort()
    for coin in coins:
        if coin > (maxChange + 1):
            return maxChange + 1
        maxChange += coin
    return maxChange + 1
