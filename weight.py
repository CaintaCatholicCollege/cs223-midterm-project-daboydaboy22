while True:
    print("\t\t***************************")
    print("\t\tWelcome to weight converter!")
    print("\t\t***************************")
    weight = float(input("\t\tEnter your weight: "))
    unit = input("\t\tPress K for Kg, Press L for Lbs: ")

    if unit == "K":
        weight = weight * 2.205
        print("\t\tYou are "+str(weight)+" Lbs")
    elif unit == "L":
        weight = weight / 2.205
        print("\t\tYou are " + str(weight) + " Kg")
    else:
        print("\t\tInvalid weight type!")
    print("\t\t******************************************************")
    tryAgain = input("\t\tDo you want to input another weight? (y/n):")
    print("\t\t******************************************************")
    if tryAgain != 'y':
            print("\t\t*****************************************")
            print("\t\tThank you for using our weight converter!")
            print("\t\t*****************************************")
    break
