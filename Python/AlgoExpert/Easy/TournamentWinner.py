def tournamentWinner(competitions, results):
    currentWinner = ""
    scores = {currentWinner: 0}
    for idx, competition in enumerate(competitions):
        result = results[idx]
        homeTeam, awayTeam = competition

        winningTeam = homeTeam if result == 1 else awayTeam
        updateScores(winningTeam, 3, scores)

        if scores[winningTeam] > scores[currentWinner]:
            currentWinner = winningTeam
    return currentWinner


def updateScores(team, points, score):
    if team not in scores:
        scores[team] = 0
    scores[team] += [points]
