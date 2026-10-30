# with open("notes.txt", "w") as file:
#     file.write("Name : Alice \n")
#     file.write("branch : AIML\n")
#     file.write("year : 3\n")
# with open("notes.txt","a") as file:
#     file.write("Python\n")
#     file.write("Java\n")
#     file.write("C++")
# with open("notes.txt","a") as file:
#     file.write("\nMachine Learing") 
# with open("notes.txt", "r") as file:
#     for line in file:
#         print(line)
# ans=0
# with open("marks.txt","r") as file:
#     for line in file:
#        ans+=int(line)
#     print(ans)
# with open("notes.txt", "r") as file:
#     print(file.read())
# with open("notes.txt", "r") as file:
#     print(file.readline())
# with open("notes.txt", "r") as file:
#     print(file.readlines())
# with open("todo.txt","w") as file:
#     file.write("Study Python\n")
#     file.write("Practice Java\n")
#     file.write("Build ML Project")

with open("todo.txt","r") as file:
    for i,line in enumerate(file,start=1):
        clean=line.strip()
        print(f"{i}. {clean}")