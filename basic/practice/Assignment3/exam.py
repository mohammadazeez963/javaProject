A = int(input("Enter the A value: "))
B = int(input("Enter the B value: "))
C = int(input("Enter the C value: "))
D = int(input("Enter the D value: "))
E = 0


while(A!=B):
    if(A > B):
        A -= C
        B -= 1
        E += 1
    else:
        B += D
        A += 1
        E +=1

print(E)


    
