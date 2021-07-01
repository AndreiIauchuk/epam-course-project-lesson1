/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6.service;

import by.epamtc.iovchuk.lesson1.validator.Validator;

public class PastTimeService {

    /**
     * Максимальное количество секунд в одних сутках.
     */
    private final static int MAX_SECONDS_IN_DAY = 86400;

    /**
     * Максимальное количество секунд в одном часе.
     */
    private final static int MAX_SECONDS_IN_HOUR = 3600;

    /**
     * Максимальное количество секунд в одной минуте.
     */
    private final static int MAX_SECONDS_IN_MINUTE = 60;

    /**
     * Вычисляет количество часов,
     * пройденных к моменту указанной секунды.
     *
     * @param seconds количество секунд, для которых
     *                вычисляется количество пройденных часов
     * @return количество пройденных часов
     */
    public byte calculatePastHours(int seconds) {
        if (!validateSeconds(seconds)) {
            return -1;
        }

        return (byte) (seconds / MAX_SECONDS_IN_HOUR);
    }

    /**
     * Вычисляет количество секунд,
     * оставшихся после вычисления количества часов,
     * пройденных к моменту указанной секунды.
     *
     * @param seconds количество секунд, для которых
     *                вычисляется количество оставшихся секунд
     * @return количество оставшихся секунд
     */
    public int calcRemainingSecondsAfterPastHours(int seconds) {
        if (!validateSeconds(seconds)) {
            return -1;
        }

        return seconds % MAX_SECONDS_IN_HOUR;
    }

    /**
     * Вычисляет количество минут,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов.
     *
     * @param seconds количество секунд, для которых
     *                вычисляется количество пройденных минут
     * @return количество пройденных минут
     */
    public short calculatePastMinutes(int seconds) {
        if (!validateSeconds(seconds)) {
            return -1;
        }

        return (short) (seconds / MAX_SECONDS_IN_MINUTE);
    }

    /**
     * Вычисляет количество секунд,
     * оставшихся после вычисления количества минут,
     * пройденных к моменту указанной секунды.
     *
     * @param seconds количество секунд, для которых
     *                вычисляется количество оставшихся секунд
     * @return количество оставшихся секунд
     */
    public int calcRemainingSecondsAfterPastMinutes(int seconds) {
        if (!validateSeconds(seconds)) {
            return -1;
        }

        return seconds % MAX_SECONDS_IN_MINUTE;
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean validateSeconds(int seconds) {
        Validator validator = new Validator();

        return (validator.validateOverZero(seconds)
                && validator.validateLessOrEqualsMax(seconds, MAX_SECONDS_IN_DAY));
    }
}
