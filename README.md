# PetBAG SNHU

## 1-6 Milestone: Pseudocode and Flowchart

### Pseudocode

```
START

Enter petType ('Dog'/'Cat')

    IF petType = 'Dog'

        IF getDogSpaces() > 0:
            setDaysStay(How Many Days staying?)
            Returning Pet? (True/False)

                IF True:
                    getPetSpecification() {
                        dogName = getDogName()
                        dogWeight = getDogWeight()
                        dogSpaceNum = getDogSpaceNumber()
                        daysStay = getDaysStay()
                    }

                ELSE:
                    Enter petName ("")
                    Enter petAge (int)
                    Enter dogWeight (int)
                    dogSpaceNum = random int in range getDogSpaces()
                    setPetSpecification() {
                        setPetName(petName)
                        setPetAge(petAge)
                        setDogWeight(dogWeight)
                        setDogSpaceNumber(dogSpaceNum)
                    }
                ENDIF

                IF daysStay > 2:
                    Would you like to add Grooming? ('yes'/'no')

                    IF 'yes':
                        grooming = setGrooming(true)
                    ENDIF

                ELSE:
                    'Must stay 2+ days for grooming eligibility'
                ENDIF

        ELSE:
            'No Dog Spaces available'
        ENDIF

    ELSE:
       IF getCatSpaces() > 0:
            setDaysStay(How Many Days staying?)
            Returning Pet? (True/False)

                IF True:
                    getPetSpecification() {
                        catName = getCatName()
                        catSpaceNum = getCatSpaceNumber()
                        daysStay = getDaysStay()
                    }

                ELSE:
                    Enter petName ("")
                    Enter petAge (int)
                    catSpaceNum = random int in range getCatSpaces()
                    setPetSpecification() {
                        setPetName(petName)
                        setPetAge(petAge)
                        setCatSpaceNumber(catSpaceNum)
                        daysStay = getDaysStay()
                    }
                ENDIF

        ELSE:
            'No Cat Spaces available'
        ENDIF

    ENDIF


END
```
