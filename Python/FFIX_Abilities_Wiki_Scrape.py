"""
Pulls abilites from wiki and writes to .csv
"""
import os
import pandas as pd
import requests
import csv
import pathlib
import tkinter as tk

# The different categories for analysis.
Ability_Types = ["Support Abilities", "Black Magic", "White Magic", "Dragon", "Thief Skills", "Blue Magic"]

# A reference file for each category, to be used for individualization of items.
Support_File = os.getcwd() + "\\FFIXRefData\\FFIX_Support_Abilities.csv"
BlkMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_Black_Magic.csv"
WhtMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_White_Magic.csv"
Dragon_File = os.getcwd() + "\\FFIXRefData\\FFIX_Dragon.csv"
Skills_File = os.getcwd() + "\\FFIXRefData\\FFIX_Skills.csv"
BlueMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_Blue_Magic.csv"
File_list = [Support_File, BlkMag_File, WhtMag_File, Dragon_File, Skills_File, BlueMag_File]
Types_Dict = dict(zip(Ability_Types, File_list))


def Download_files():
    # Optional function to download and save reference data.
    html1 = requests.get("https://finalfantasy.fandom.com/wiki/Final_Fantasy_IX_support_abilities")
    html2 = requests.get("https://finalfantasy.fandom.com/wiki/Blk_Mag_(Final_Fantasy_IX)")
    html3 = requests.get("https://finalfantasy.fandom.com/wiki/Wht_Mag_(Final_Fantasy_IX)")
    html4 = requests.get("https://finalfantasy.fandom.com/wiki/Dragon_(Final_Fantasy_IX_command)")
    html5 = requests.get("https://finalfantasy.fandom.com/wiki/Skill_(Final_Fantasy_IX)")
    html6 = requests.get("https://finalfantasy.fandom.com/wiki/Blu_Mag_(Final_Fantasy_IX)")
    path = pathlib.Path(os.getcwd() + "\\FFIXRefData")
    path.mkdir(exist_ok=True)  # Creates the folder to save the files within.
    df_list = pd.read_html(html1.text)  # this parses all the tables in webpage to a list
    df = df_list[0]  # Selects the table
    data = (df.iloc[::2])  # Skips every other row due to formatting of site table
    data.to_csv(Support_File, index=False)
    df_list2 = pd.read_html(html2.text)
    df2 = df_list2[0]
    data2 = (df2.iloc[::2])
    data2.to_csv(BlkMag_File, index=False)
    df_list3 = pd.read_html(html3.text)
    df3 = df_list3[0]
    data3 = (df3.iloc[::2])
    data3.to_csv(WhtMag_File, index=False)
    df_list4 = pd.read_html(html4.text)
    df4 = df_list4[0]
    data4 = (df4.iloc[::2])
    data4.to_csv(Dragon_File, index=False)
    df_list5 = pd.read_html(html5.text)
    df5 = df_list5[0]
    data5 = (df5.iloc[::2, :-1])  # Skips every other row and drops final column
    data5.to_csv(Skills_File, index=False)
    df_list6 = pd.read_html(html6.text)
    df6 = df_list6[0]
    data6 = (df6.iloc[::2, :-1])
    data6.to_csv(BlueMag_File, index=False)
    print("Files downloaded")


window = tk.Tk()
header = tk.Label(text="FFIX Abilities List").pack()
DownloadBtn = tk.Button(text="Download Files \n Required for first use.", command=Download_files)
DownloadBtn.pack()
label1 = tk.Label(text="Categories").pack()
results = tk.Frame(window)
results.pack(side=tk.BOTTOM)
output = tk.Frame(window)
output.pack()


def read_ability(data_file, ability):
    with open(data_file, 'r+') as f:
        reader = csv.reader(f, delimiter=',')
        for i in reader:
            if i[0] == ability:
                try:
                    printout = tk.Label(output, text=(i[0] + "\n" + i[1] + i[2] + "\n" + i[3] + "\n" + i[4] + i[5] + "\n"), wraplength=500)
                    printout.pack()
                except IndexError:
                    try:
                        printout = tk.Label(output, text=(i[0] + "\n" + i[1] + i[2] + "\n" + i[3] + i[4] + "\n"), wraplength=500)
                        printout.pack()
                    except IndexError:
                        printout = tk.Label(output, text=(i[0] + "\n" + i[1] + i[2] + "\n" + i[3] + "\n"), wraplength=500)
                        printout.pack()
        f.close()


def open_file(data_file):
    with open(data_file, 'r+') as f:
        reader = csv.reader(f, delimiter=",")
        next(reader)
        r = 0
        c = 0
        for widget in results.winfo_children():
            widget.destroy()
        for i in reader:
            button = tk.Button(results, text=i[0], relief=tk.RAISED, command=lambda i=i: read_ability(data_file, i[0]))
            button.grid(row=r, column=c)
            c += 1
            if c == 10:
                r += 1
                c = 0
        f.close()


Sframe = tk.Frame(window)
Sframe.pack(side=tk.LEFT)
BMframe = tk.Frame(window)
BMframe.pack(side=tk.LEFT)
WMframe = tk.Frame(window)
WMframe.pack(side=tk.LEFT)
DGframe = tk.Frame(window)
DGframe.pack(side=tk.LEFT)
TSframe = tk.Frame(window)
TSframe.pack(side=tk.LEFT)
BLframe = tk.Frame(window)
BLframe.pack(side=tk.LEFT)
Support_Button = tk.Button(Sframe, text="Support Abilities", command=lambda: open_file(Support_File))
Support_Button.pack()
BlkMag_Button = tk.Button(BMframe, text="Black Mage Spells", command=lambda: open_file(BlkMag_File))
BlkMag_Button.pack()
WhtMag_Button = tk.Button(WMframe, text="White Mage Spells", command=lambda: open_file(WhtMag_File))
WhtMag_Button.pack()
Dragon_Button = tk.Button(DGframe, text="Dragon Abilities", command=lambda: open_file(Dragon_File))
Dragon_Button.pack()
TS_Button = tk.Button(TSframe, text="Thief Skills", command=lambda: open_file(Skills_File))
TS_Button.pack()
BluMag_Button = tk.Button(BLframe, text="Blue Mage Spells", command=lambda: open_file(BlueMag_File))
BluMag_Button.pack()

window.mainloop()
