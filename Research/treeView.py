from Tkinter import *
import ttk

root = Tk()
tree = ttk.Treeview(root)

tree["columns"] = ("one","two")

#column styles
tree.column("one",width=100)
tree.column("two",width=100)
tree.heading("one",text="column A")
tree.heading("two",text="column B")

tree.insert("",0,text="Line 1",values=("1A","1b"))

id2 = tree.insert("",1,"dir2",text="Dir 2")
tree.insert(id2,"end","dir 2",text="Sub dir 2",values=("2A","2B"))
mainloop()
