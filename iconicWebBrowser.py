from Tkinter import *
import urlHandle

def go():
    text.delete(1.0,END)
    conn = urlHandle.urlHandle(entry.get())
    conn.openURL()
    text.insert(INSERT,conn.getURLdata())
    conn.closeURL()
    
root = Tk()
root.title("Iconic Web Browser")
label = Label(root,text="url:")
entry = Entry(root)
button = Button(root,text="Go",command=go)
text = Text(root)

label.pack(side=TOP)
entry.pack(side=TOP)
button.pack(side=TOP)
text.pack(side=TOP)

root.mainloop()


    
