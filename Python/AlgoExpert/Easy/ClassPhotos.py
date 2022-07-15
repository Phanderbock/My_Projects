def classPhotos(redShirtHeights, blueShirtHeights):
    # Write your code here.
    validResult = "Red >= Blue" if redShirtHeights[0]<blueShirtHeights[0] else "Blue >= Red"

    for Red, Blue in zip(sorted(redShirtHeights), sorted(blueShirtHeights)):
        if eval(validResult):
            return False
    return True
