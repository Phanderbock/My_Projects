"""
Tool to browse abilities from the FFIX video game. With GUI.
"""
import os
import csv
import tkinter as tk

# A reference file for each category, to be used for individualization of items.
Support_File = os.getcwd() + "\\FFIXRefData\\FFIX_Support_Abilities.csv"
BlkMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_Black_Magic.csv"
WhtMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_White_Magic.csv"
Dragon_File = os.getcwd() + "\\FFIXRefData\\FFIX_Dragon.csv"
Skills_File = os.getcwd() + "\\FFIXRefData\\FFIX_Skills.csv"
BlueMag_File = os.getcwd() + "\\FFIXRefData\\FFIX_Blue_Magic.csv"
Knives_File = os.getcwd() + "\\FFIXRefData\\FFIX_Knives.csv"
ThiefSwords_File = os.getcwd() + "\\FFIXRefData\\FFIX_ThiefSwords.csv"
Rods_File = os.getcwd() + "\\FFIXRefData\\FFIX_Rods.csv"
Rackets_File = os.getcwd() + "\\FFIXRefData\\FFIX_Rackets.csv"
Flutes_File = os.getcwd() + "\\FFIXRefData\\FFIX_Flutes.csv"
Swords_File = os.getcwd() + "\\FFIXRefData\\FFIX_Swords.csv"
Knight_Swords_File = os.getcwd() + "\\FFIXRefData\\FFIX_Knight_Swords.csv"
Staves_File = os.getcwd() + "\\FFIXRefData\\FFIX_Staves.csv"
Spears_File = os.getcwd() + "\\FFIXRefData\\FFIX_Spears.csv"
Forks_File = os.getcwd() + "\\FFIXRefData\\FFIX_Forks.csv"
Claws_File = os.getcwd() + "\\FFIXRefData\\FFIX_Claws.csv"

# Initialize the Tkinter window and first buttons.
window = tk.Tk()
header = tk.Label(text="FFIX Abilities List").pack()
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
        titles = next(reader)
        categories = tk.Label(output, text=("\n".join(titles)))
        categories.pack(side=tk.LEFT)
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
