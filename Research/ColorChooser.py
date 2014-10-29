from Tkinter import *
from tkColorChooser import askcolor

def getColor():
    color = askcolor()
    print color
Button(text='Select Color',command=getColor).pack()
mainloop()    	