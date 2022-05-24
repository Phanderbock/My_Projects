"""
Tool to browse abilities from the FFIX video game. With GUI.
"""
import os
import pandas as pd
import requests
import csv
import pathlib
import tkinter as tk

# A reference file for each category, to be used for individualization of items.
Support_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Support_Abilities.csv"
BlkMag_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Black_Magic.csv"
WhtMag_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_White_Magic.csv"
Dragon_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Dragon.csv"
Skills_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Skills.csv"
BlueMag_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Blue_Magic.csv"
Knives_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Knives.csv"
ThiefSwords_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_ThiefSwords.csv"
Rods_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Rods.csv"
Rackets_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Rackets.csv"
Flutes_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Flutes.csv"
Swords_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Swords.csv"
Knight_Swords_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Knight_Swords.csv"
Staves_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Staves.csv"
Spears_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Spears.csv"
Forks_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Forks.csv"
Claws_File = os.getcwd() + "\\FFIXRawRefData\\FFIX_Claws.csv"

Weapons_Files = [Knives_File, ThiefSwords_File, Rods_File, Rackets_File, Flutes_File,
Swords_File, Knight_Swords_File, Staves_File, Spears_File, Forks_File, Claws_File]


def Download_files():
    # Optional function to download and save reference data.
    html1 = requests.get("https://finalfantasy.fandom.com/wiki/Final_Fantasy_IX_support_abilities")
    html2 = requests.get("https://finalfantasy.fandom.com/wiki/Blk_Mag_(Final_Fantasy_IX)")
    html3 = requests.get("https://finalfantasy.fandom.com/wiki/Wht_Mag_(Final_Fantasy_IX)")
    html4 = requests.get("https://finalfantasy.fandom.com/wiki/Dragon_(Final_Fantasy_IX_command)")
    html5 = requests.get("https://finalfantasy.fandom.com/wiki/Skill_(Final_Fantasy_IX)")
    html6 = requests.get("https://finalfantasy.fandom.com/wiki/Blu_Mag_(Final_Fantasy_IX)")
    html7 = requests.get("https://finalfantasy.fandom.com/wiki/Final_Fantasy_IX_weapons")
    path = pathlib.Path(os.getcwd() + "\\FFIXRawRefData")
    path.mkdir(exist_ok=True)  # Creates the folder to save the files within.
    Support_Tables = pd.read_html(html1.text)  # this parses all the tables in webpage to a list
    Support_Data = Support_Tables[0]  # Selects the table
    data = (Support_Data.iloc[::2])  # Skips every other row due to formatting of site table
    data.to_csv(Support_File, index=False)
    Black_Magic_Tables = pd.read_html(html2.text)
    Black_Magic_Data = Black_Magic_Tables[0]
    data2 = (Black_Magic_Data.iloc[::2])
    data2.to_csv(BlkMag_File, index=False)
    White_Magic_Tables = pd.read_html(html3.text)
    White_Magic_Data = White_Magic_Tables[0]
    data3 = (White_Magic_Data.iloc[::2])
    data3.to_csv(WhtMag_File, index=False)
    Dragon_Abilities_Tables = pd.read_html(html4.text)
    Dragon_Abilities_Data = Dragon_Abilities_Tables[0]
    data4 = (Dragon_Abilities_Data[::2])
    data4.to_csv(Dragon_File, index=False)
    Thief_Skills_Tables = pd.read_html(html5.text)
    Thief_Skills_Data = Thief_Skills_Tables[0]
    data5 = (Thief_Skills_Data.iloc[::2, :-1])  # Skips every other row and drops final column
    data5.to_csv(Skills_File, index=False)
    Blue_Magic_Tables = pd.read_html(html6.text)
    Blue_Magic_Data = Blue_Magic_Tables[0]
    data6 = (Blue_Magic_Data.iloc[::2, :-1])
    data6.to_csv(BlueMag_File, index=False)
    Weapons_Tables = pd.read_html(html7.text)
    Knives_Data = Weapons_Tables[0]
    Knives_Data.drop(Knives_Data.columns[[1, 3]], axis=1, inplace=True)
    data7 = (Knives_Data.iloc[::2])
    data7.to_csv(Knives_File, index=False)
    ThiefSwords_Data = Weapons_Tables[1]
    ThiefSwords_Data.drop(ThiefSwords_Data.columns[[1, 3]], axis=1, inplace=True)  # Drops column in array 1 and 3
    data8 = (ThiefSwords_Data.iloc[::2])
    data8.to_csv(ThiefSwords_File, index=False)
    Rods_Data = Weapons_Tables[2]
    Rods_Data.drop(Rods_Data.columns[[1, 4]], axis=1, inplace=True)
    data9 = (Rods_Data.iloc[::2])
    data9.to_csv(Rods_File, index=False)
    Rackets_Data = Weapons_Tables[3]
    Rackets_Data.drop(Rackets_Data.columns[[1, 4]], axis=1, inplace=True)
    data10 = (Rackets_Data.iloc[::2])
    data10.to_csv(Rackets_File, index=False)
    Flutes_Data = Weapons_Tables[4]
    Flutes_Data.drop(Flutes_Data.columns[[1, 3, 4]], axis=1, inplace=True)
    data11 = (Flutes_Data.iloc[::2])
    data11.to_csv(Flutes_File, index=False)
    Swords_Data = Weapons_Tables[5]
    Swords_Data.drop(Swords_Data.columns[[1]], axis=1, inplace=True)
    data12 = (Swords_Data.iloc[::2])
    data12.to_csv(Swords_File, index=False)
    Knight_Swords_Data = Weapons_Tables[6]
    Knight_Swords_Data.drop(Knight_Swords_Data.columns[[1]], axis=1, inplace=True)
    data13 = (Knight_Swords_Data.iloc[::2])
    data13.to_csv(Knight_Swords_File, index=False)
    Staves_Data = Weapons_Tables[7]
    Staves_Data.drop(Staves_Data.columns[[1]], axis=1, inplace=True)
    data14 = (Staves_Data.iloc[::2])
    data14.to_csv(Staves_File, index=False)
    Spears_Data = Weapons_Tables[8]
    Spears_Data.drop(Spears_Data.columns[[1]], axis=1, inplace=True)
    data15 = (Spears_Data.iloc[::2])
    data15.to_csv(Spears_File, index=False)
    Forks_Data = Weapons_Tables[9]
    Forks_Data.drop(Forks_Data.columns[[1, 3]], axis=1, inplace=True)
    data16 = Forks_Data.iloc[::2]
    data16.to_csv(Forks_File, index=False)
    Claws_Data = Weapons_Tables[10]
    Claws_Data.drop(Claws_Data.columns[[1]], axis=1, inplace=True)
    data17 = Claws_Data.iloc[::2]
    data17.to_csv(Claws_File, index=False)
    print("Files downloaded")


# Initialize the Tkinter window and first buttons.
window = tk.Tk()
header = tk.Label(text="FFIX Abilities List").pack()
DownloadBtn = tk.Button(text="Download Files \n Required for first use.", command=Download_files)
DownloadBtn.pack()
results = tk.Frame(window)
results.pack(side=tk.BOTTOM)
output = tk.Frame(window)
output.pack()
label1 = tk.Label(text="Categories").pack()


# Function to print out row from .csv for specified ability.
def read_ability(data_file, ability):
    for widget in output.winfo_children():
        widget.destroy()
    with open(data_file, 'r+') as f:
        reader = csv.reader(f, delimiter=',')
        for i in reader:
            if i[0] == ability:
                result = ("\n".join(i))
                printout = tk.Label(output, text=result, wraplength=500)
                printout.pack()
        f.close()


# Function to create appropriate ability options based on chosen category.
def open_file(data_file):
    with open(data_file, 'r+') as f:
        reader = csv.reader(f, delimiter=",")
        next(reader)
        r = 5
        c = 0
        for widget in results.winfo_children():
            widget.destroy()
        for i in reader:
            button = tk.Button(results, text=i[0], relief=tk.RAISED, command=lambda i=i: read_ability(data_file, i[0]))
            button.grid(row=r, column=c)
            c += 1
            if c == 8:
                r += 1
                c = 0
        f.close()


def Weapon_Classes():
    for widget in Weapons.winfo_children():
        widget.destroy()
    Weapon_dict = {'Knives': Knives_File, 'ThiefSwords': ThiefSwords_File, 'Rods': Rods_File,
        'Rackets': Rackets_File, 'Flutes': Flutes_File, 'Swords': Swords_File,
        'KnightSwords': Knight_Swords_File, 'Staves': Staves_File, 'Spears': Spears_File,
        'Forks': Forks_File, 'Claws': Claws_File}
    for key, value in Weapon_dict.items():
        Button = tk.Button(Weapons, text=key, command=lambda v=value: open_file(v))
        Button.pack(side=tk.LEFT)


# Frame and Button for each category.
Classes = tk.Frame(window)
Classes.pack()
Support_Button = tk.Button(Classes, text="Support Abilities", command=lambda: open_file(Support_File))
Support_Button.grid(row=4, column=0)
BlkMag_Button = tk.Button(Classes, text="Black Mage Spells", command=lambda: open_file(BlkMag_File))
BlkMag_Button.grid(row=4, column=1)
WhtMag_Button = tk.Button(Classes, text="White Mage Spells", command=lambda: open_file(WhtMag_File))
WhtMag_Button.grid(row=4, column=2)
Dragon_Button = tk.Button(Classes, text="Dragon Abilities", command=lambda: open_file(Dragon_File))
Dragon_Button.grid(row=4, column=3)
TS_Button = tk.Button(Classes, text="Thief Skills", command=lambda: open_file(Skills_File))
TS_Button.grid(row=4, column=4)
BluMag_Button = tk.Button(Classes, text="Blue Mage Spells", command=lambda: open_file(BlueMag_File))
BluMag_Button.grid(row=4, column=5)
Weapons_Button = tk.Button(Classes, text="Weapons", command=lambda: Weapon_Classes())
Weapons_Button.grid(row=4, column=6)
Weapons = tk.Frame(window)
Weapons.pack()

window.mainloop()
