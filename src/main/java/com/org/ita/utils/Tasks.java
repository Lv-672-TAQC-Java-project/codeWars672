package com.org.ita.utils;

public enum Tasks {
    KEEP_HYDRATED(1, "Keep Hydrated!"),
    VOLUME_OF_A_CUBOID(2, "Volume of a cuboid"),
    MILES_PER_GALLON_TO_KILOMRTERS(3, "Miles per gallon to kilometers per liter"),
    TO_SQUARE_ROOT_OR_NO_TO_SQUARE(4, "To square root or no to square"),
    COUNT_OF_POSITIVES_SUM_OF_NEGATIVES(5, "Count of positives / sum of negatives"),
    CONVERT_A_STRING_TO_A_NUMBER(6, "Convert a String to a Number!"),
    WILLSON_PRIMES(7, "Willson primes"),
    FORMATTING_DECIMAL_PLACES(8, "Formatting decimal places"),
    FIND_NUMBERS_WHICH_ARE_DIVISIBLE_BY_GIVEN_NUMBER(9, "Find numbers which are divisible by given number"),
    LOOKING_FOR_A_BENEFACTOR(10, "Looking for a benefactor"),
    SUM_OF_THE_FIRST_NTN_TERM_OF_SERIES(11, "Sum of the first nth term of Series"),
    WHERE_IS_VASYA(12, "Where is Vasya?"),
    BUILD_A_PIPLE_OF_CUBES(13, "Build a pile of Cubes"),
    EASY_BALANCE_CHECKING(14, "Easy balance checking"),
    FLOATING_POINT_APPRXIMATION(15, "Floating-point Approximation (I)"),
    RAINFALL(16, "Rainfall"),
    RANKING_NBA(17, "Ranking NBA"),
    HELP_THE_BOOKSELLER(18, "Help the bookseller!"),
    ARTIFICIAL_RAIN(19, "Artificial Rain"),
    GAP_IN_PRIMES(20, "Gap in Primes"),
    TRAILING_ZERO_IN_FACTORIAL(21, "Trailing zeros in factorial"),
    PERIMETER_OF_SQUARES_IN_A_RECTANGLE(22, "Perimeter of squares in a rectangle"),
    WHICH_X_FOR_THAT_SUM(23, "Which x for that sum?"),
    FINDTHE_SMALLEST(24, "Find the smallest");

    private final int idTask;
    private final String nameTask;

    Tasks(int idTask, String nameTask) {
        this.idTask = idTask;
        this.nameTask = nameTask;
    }

    public int getIdTask() {
        return idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public Tasks getTaskById(int idTask) {
        for (Tasks task : Tasks.values()) {
            if (task.idTask == idTask) {
                return task;
            }
        }
        return null;
    }

    public static void printAllTaskName() {
        for (Tasks task : Tasks.values()) {
            System.out.println(String.format("IdTask: %d, NameTask: %s", task.idTask, task.nameTask));
        }
    }
}
