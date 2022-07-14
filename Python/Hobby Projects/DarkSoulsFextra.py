# -*- coding: utf-8 -*-
"""
Created on Thu Dec  2 12:34:24 2021

@author: Brennan

Program is intended as a repository of information on effects and locations of
spells and the scrolls which they are learned from.
"""

""" Scrolls. [1]:Use, [2]:Location"""

Scrolls = {
    "Sage's Scroll": {'Use': 'Give to Orbeck of Vinheim to unlock Great Farron Dart and Farron Hail',
        'Location': 'Farron Keep, Keep Ruins bonfire. Look left after going down to swamp. It is across the swamp guarded by enemies. Mushroom corner'},
    "Golden Scroll": {'Use': 'Give to Orbeck of Vinheim to unlock Cast Light, Repair, Hidden Body, Hidden Weapon, and Twisted Wall of Light',
        'Location': 'Farron Keep, Keep ruins bonfire. Walk all the way down to the end of the fallen bridge, and follow the right wall through the poison swamp. The scroll is in a cave at the end of that wall guarded by some basilisks.'},
    "Logan's Scroll": {'Use': 'Give to Orbeck of Vinheim to unlock Soul Spear and Homing Soulmass.',
        'Location': 'Irithyll Dungeon, poison swamp in Profaned Capital.  Climb to the roof of the building and defeat the sorcerer NPC.'},
    "Crystal Scroll": {'Use': 'Give to Orbeck of Vinheim to unlock Homing Crystal Soulmass, Crystal Soul Spear, and Crystal Magic Weapon.',
        'Location': 'Lothric Castle, defeat the Crystal Sage in the Grand Archives'}
    }

"""Sorcery. Name. Description. Source."""
Sorcery = {
    "Soul Arrow": {'Description': "Fires a soul arrow.",
        'Source': "Sold by Yoel of Londor for 1,000 souls. Sold by Yuria of Londor for 1,000 souls. Sold by Orbeck of Vinheim for 1,000 souls. Starting Equipment for the Sorcerer."},
    "Great Soul Arrow": {'Description': "Fires a more powerful soul arrow.",
        "Source.": "Sold by Orbeck of Vinheim for 3,000 souls."},
    "Heavy Soul Arrow": {"Description": "Fires a heavy soul arrow.",
        "Source": "Sold by Yoel of Londor for 2,000 souls . Sold by Yuria of Londor for 2,000 souls. Sold by Orbeck of Vinheim for 2,000 souls. Starting Equipment for the Sorcerer."},
    "Great Heavy Soul Arrow": {"Description": "Fires a more powerful heavy soul arrow.",
        "Source": "Sold by Orbeck of Vinheim for 4,000 souls."},
    "Farron Dart": {"Description": "Fires a soul dart.",
        "Source": "Sold by Yoel of Londor for 1,000 souls. Sold by Orbeck of Vinheim for 500 souls. Sold by Shrine Handmaid for 1,000 souls."},
    "Great Farron Dart": {"Description": "Fires a more powerful soul dart.",
        "Source": "Sold by Orbeck of Vinheim for 2,000 souls. Requires Sage's Scroll."},
    "Farron Hail": {"Description": "Fires a cascade of soul darts.",
        "Source": "Sold by Orbeck of Vinheim for 5,000 souls. Requires Sage's Scroll."},
    "Homing Soulmass": {"Description": "Releases a homing soulmass.",
        "Source": "Sold by Orbeck of Vinheim for 6,000 souls. Require's Logan's Scroll."},
    "Homing Crystal Soulmass": {"Description": "Releases a homing crystal soulmass. Crystal soulmass has piercing qualities.",
        "Source": "Sold by Orbeck of Vinheim for 18,000 souls. Requires Crystal Scroll."},
    "Crystal Hail": {"Description": "Casts a cascade of small crystal soulmasses from above. Crystal soulmasses have piercing qualities.",
        "Source": "Obtained by Soul of a Crystal Sage Transposition."},
    "Soul Spear": {"Description": "Fires a soul spear.",
        "Source": "Sold by Orbeck of Vinheim for 5,000 souls. Requires Logan's Scroll."},
    "Crystal Soul Spear": {"Description": "Fires a Crystal Soul Spear",
        "Source": "Sold by Orbeck of Vinheim for 15,000 souls. Requires Crystal Scroll"},
    "White Dragon Breath": {"Description": "Emits crystal breath of Seath the Scaleless. Crystal breath has piercing qualities.",
        "Source": "Obtained by Soul of Consumed Oceiros Transposition."},
    "Soul Stream": {"Description": "Fires a torrential volley of souls.",
        "Source": "Found in Lothric Castle in the Grand Archives behind a hidden room with a Boreal Knight."},
    "Soul Greatsword": {"Descriptipn": "Attacks with a greatsword formed from souls.",
        "Source": "Sold by Yoel of Londor for 5,000 souls. Sold by Yuria of Londor for 5,000 souls. Sold by Orbeck of Vinheim for 5,000 souls."},
    "Farron Flashsword": {"Description": "Alteration of Soul Greatsword developed by sorcerers of the Undead Legion of Farron.",
        "Source": "Sold by Orbeck Of Vinheim for 3,000 souls."},
    'Magic Weapon': {"Description": 'Reinforce right hand weapon with magic.',
        "Source": 'Sold by Yoel of Londor for 4,500 souls. Sold by Yuria of Londor for 4,500 souls. Sold by Orbeck of Vinheim for 3,000 souls.'},
    'Great Magic Weapon': {"Description": 'Greatly reinforce right hand weapon with magic.',
        "Source": 'From the Farron Keep Perimeter bonfire, turn around 180 and head towards the shortcut gate to Road of Sacrifices. The spell will be on a corpse at the gate.'},
    'Crystal Magic Weapon': {"Description": 'Reinforce right hand weapon with crystal.',
        "Source": 'Sold by Orbeck of Vinheim for 10,000 souls. Requires Crystal Scroll.'},
    'Magic Shield': {"Description": 'Reinforce left hand shield with magic.',
        "Source": 'Sold by Yoel of Londor for 4,500 souls. Sold by Yuria of Londor for 4,500 souls. Sold by Orbeck of Vinheim for 3,000 souls.'},
    'Great Magic Shield': {"Description": 'Greatly reinforce left hand shield with magic.',
        'Source': 'Found in Irithyll Dungeon.'},
    'Spook': {"Description": 'Mask noise and negate fall damage.',
        'Source': 'Sold by Orbeck Of Vinheim for 2,000 souls.'},
    'Aural Decoy': {"Description": 'Distract foes with a distant sound.',
        "Source": 'Sold by Orbeck Of Vinheim for 2,000 souls.'},
    'Pestilent Mist': {"Description": 'Releases dense mist that eats away at HP. Beware, as the caster is not immune to its effect.',
        "Source": 'Sold by Orbeck Of Vinheim for 1,000 souls.'},
    'Cast light': {"Description": 'Illuminate surrounding area.',
        "Source": 'Sold by Orbeck Of Vinheim for 1,000 souls. Requires Golden Scroll.'},
    'Repair': {"Description": 'Repair all equipped weapons and armor.',
        "Source": 'Sold by Orbeck of Vinheim for 2,000 souls. Requires Golden Scroll.'},
    'Hidden Weapon': {"Description": 'Turns right hand weapon invisible',
        "Source": 'Sold by Orbeck of Vinheim for 1,500 souls. Requires Golden Scroll.'},
    'Hidden Body': {"Description": 'Turns your body nearly invisible.',
        "Source": 'Sold by Orbeck of Vinheim for 3,000 souls. Requires Golden Scroll.'},
    'Chameleon': {"Description": 'Transforms you into something inconspicuous.',
        "Source": "Found near the Church of Yorshka bonfire in  Irithyll of the Boreal Valley during Anri of Astora's questline. The spell will drop from an assassin disguised as a statue.Found in the Darkmoon Tomb from the assassin's corpse if not killed earlier."},
    'Twisted Wall of light': {"Description": 'Distorts light to deflect magic.',
        "Source": 'Sold by Orbeck of Vinheim for 6,000 souls. Requires Golden Scroll.'},
    'Deep Soul': {"Description": 'Fires dark soul dregs',
        "Source": 'Obtained by Soul of the Deacons of the Deep Transposition.'},
    'Great Deep Soul': {"Description": 'Fires powerful darkened soul sediment.',
        "Source": 'Reward for rank 1 of Aldritch Faithful.'},
    'Affinity': {"Description": 'Create a dark manifestation of humanity.',
        "Source": 'Sold by Karla for 15,000 souls.'},
    'Dark Edge': {"Description": "Strikes with a blade formed of humanity's darkness.",
        "Source": 'Sold by Karla for 8,000 souls.'},
    'Frozen Weapon': {"Description": 'Imbues right-hand weapon with frost',
        "Source": 'Ashes of Ariandel DLC:Near the Giant Flies before the Rope Bridge Cave bonfire.'},
    'Snap Freeze': {"Description": 'Creates a cloud of near-freezing mist.',
        "Source": 'Ashes of Ariandel DLC: From Depths of the Painting bonfire, turn left to where the crabs are and keep going until you reach the end of that path. The sorcery will be behind an aggressive Tree Woman.'},
    'Great Soul Dregs': {"Description": ' Fires great soul dregs',
        "Source": 'The Ringed City DLC: Behind an illusory wall in The Dreg Heap.'},
    'Old Moonlight': {"Description": 'Conceive old moonlight greatsword and attack',
        "Source": 'Transpose from soul of Darkeater Midir.'},
    }


def print_full_description_Scrolls(X):
    """Prints the key and value for the named scroll."""
    for key, value in (Scrolls[X].items()):
        print(key, ": ", value)


def print_full_description_Sorcery(Query):
    """Prints the key and value for the named sorcery."""
    for key, value in (Sorcery[Query].items()):
        print(key, ": ", value)


while True:
    """Two tiers of input and check, using user input to select individual key
    value pair for output."""
    Query = input("Do you want to know about Scrolls or a Sorcery?(Q to quit)\n")
    if Query == "Q":
        break
    elif Query == "Scrolls":
        try:
            for item in Scrolls:
                print("{}".format(item))
            Query = input("Which Scroll would you Like to know more about?\n")
            print_full_description_Scrolls(Query)
        except Exception as Ex:
            print(Ex)
            print("Please type the name in full.")

    elif Query == "Sorcery":
        try:
            for item in Sorcery:
                print("{}".format(item))
            Query = input("Which Sorcery would you like to know more about?\n")
            print_full_description_Sorcery(Query)
        except Exception as Ex:
            print(Ex)
            print("Please type the name in full.")

else:
    print("Please type either 'Scrolls' or 'Sorcery'.")
