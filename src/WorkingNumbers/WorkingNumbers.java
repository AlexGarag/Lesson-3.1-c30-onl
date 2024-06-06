package WorkingNumbers;

public class WorkingNumbers {

    public static int flipNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int numberDigitsNumber = getNumberDigitsNumber(incomingNumber);
        int convertedNumber = 0;
        int digitNumber = 0;
        int remainderDivision;
        while (digitNumber < numberDigitsNumber) {
            remainderDivision = incomingNumber % 10;
            convertedNumber = convertedNumber + (int) (remainderDivision * Math.pow(10, numberDigitsNumber - digitNumber - 1));
            incomingNumber = (incomingNumber - remainderDivision) / 10;
            digitNumber = digitNumber + 1;
        }
        return convertedNumber;
    }

    public static int getMaxDigitNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int number = Math.abs(incomingNumber);
        int numberDigitsNumber = getNumberDigitsNumber(number);
        int digitNumber = 0;
        int remainderDivision;
        int maxDigitNumber = 0;

        while (digitNumber < numberDigitsNumber) {
            remainderDivision = number % 10;
            if (remainderDivision > maxDigitNumber) {
                maxDigitNumber = remainderDivision;
            }
            number = (number - remainderDivision) / 10;
            digitNumber = digitNumber + 1;
        }
        return maxDigitNumber;

    }

    public static int getMinDigitNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int number = Math.abs(incomingNumber);
        int numberDigitsNumber = getNumberDigitsNumber(number);
        int digitNumber = 0;
        int remainderDivision;
        int maxDigitNumber = 9;
        while (digitNumber < numberDigitsNumber) {
            remainderDivision = number % 10;
            if (remainderDivision < maxDigitNumber) {
                maxDigitNumber = remainderDivision;
            }
            number = (number - remainderDivision) / 10;
            digitNumber = digitNumber + 1;
        }
        return maxDigitNumber;
    }

    public static boolean getFlagNotDuplicateDigitsNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return false;
        }
        int number = Math.abs(incomingNumber);
        int numberDigitsNumber = getNumberDigitsNumber(number);
        int digitNumber = 0;
        int quantity0 = 0;
        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;
        int quantity4 = 0;
        int quantity5 = 0;
        int quantity6 = 0;
        int quantity7 = 0;
        int quantity8 = 0;
        int quantity9 = 0;
        while (digitNumber < numberDigitsNumber) {
            int remainderDivision = number % 10;
            switch (remainderDivision) {
                case 0:
                    quantity0 = quantity0 + 1;
                    if (quantity0 > 1) {
                        return false;
                    }
                    break;
                case 1:
                    quantity1 = quantity1 + 1;
                    if (quantity1 > 1) {
                        return false;
                    }
                    break;
                case 2:
                    quantity2 = quantity2 + 1;
                    if (quantity2 > 1) {
                        return false;
                    }
                    break;
                case 3:
                    quantity3 = quantity3 + 1;
                    if (quantity3 > 1) {
                        return false;
                    }
                    break;
                case 4:
                    quantity4 = quantity4 + 1;
                    if (quantity4 > 1) {
                        return false;
                    }
                    break;
                case 5:
                    quantity5 = quantity5 + 1;
                    if (quantity5 > 1) {
                        return false;
                    }
                    break;
                case 6:
                    quantity6 = quantity6 + 1;
                    if (quantity6 > 1) {
                        return false;
                    }
                    break;
                case 7:
                    quantity7 = quantity7 + 1;
                    if (quantity7 > 1) {
                        return false;
                    }
                    break;
                case 8:
                    quantity8 = quantity8 + 1;
                    if (quantity8 > 1) {
                        return false;
                    }
                    break;
                case 9:
                    quantity9 = quantity9 + 1;
                    if (quantity9 > 1) {
                        return false;
                    }
                    break;

            }
            number = (number - remainderDivision) / 10;
            digitNumber = digitNumber + 1;
        }
        return true;
    }

    public static void findDecreasingSequence(int incomingNumber) {
        if (incomingNumber == 0) {
            System.out.println("No increasing sequence was found");
        }
        int analyzedPartNumber = Math.abs(incomingNumber);
        int numberDigitsNumber = getNumberDigitsNumber(analyzedPartNumber);
        int digitNumber = 0;
        boolean flagSequenceFound = false;

        while (digitNumber < numberDigitsNumber) {
            int lowestDigit;
            int highestDigit;
            int numberDigitsSequenceFound = 1;
            int sequenceFound = 0;
            boolean flagIsFirstSequence = false;

            while (true) {
                lowestDigit = analyzedPartNumber % 10;
                highestDigit = (analyzedPartNumber / 10) % 10;
                if (sequenceFound == 0) {
                    sequenceFound = lowestDigit;
                }
                if (lowestDigit == highestDigit + 1) {
                    if (!flagIsFirstSequence) {
                        flagIsFirstSequence = true;
                        System.out.print("The number \'" + incomingNumber + "\' contains sequences: ");
                    }
                    sequenceFound = sequenceFound * 10 + highestDigit;
                    System.out.print(sequenceFound + "; ");
                    numberDigitsSequenceFound = numberDigitsSequenceFound + 1;
                    flagSequenceFound = true;
                } else {
                    break;
                }
                analyzedPartNumber = analyzedPartNumber / 10;
                digitNumber = digitNumber + 1;
            }
            analyzedPartNumber = analyzedPartNumber / 10;
            digitNumber = digitNumber + 1;
        }
        if (!flagSequenceFound) {
            System.out.println("No increasing sequence was found");
        }
    }

    private static int getNumberDigitsNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int remainderDivision;
        int digitNumber = 1;

        do {
            remainderDivision = (int) (incomingNumber % (Math.pow(10, digitNumber)));
            if (remainderDivision == incomingNumber) {
                return digitNumber;
            }
            digitNumber = digitNumber + 1;
        } while (true);
    }
}


