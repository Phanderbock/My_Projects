def minimumWaitingTime(queries):
    queries.sort()
    runningTotal = prevTotal = 0

    for time in queries:
        runningTotal += prevTotal
        prevTotal += time

    return runningTotal
