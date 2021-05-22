/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6.service;

public class PastTimeService {

    /**
     * Количество часов,
     * пройденных к моменту указанной секунды.
     */
    private byte pastHours;

    /**
     * Количество минут,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов.
     */
    private short pastMinutes;

    /**
     * Количество секунд,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов и минут.
     */
    private short pastSeconds;

    /**
     * Максимальное количество секунд в одном часе.
     */
    private final static int MAX_SECONDS_IN_HOUR = 3600;

    /**
     * Максимальное количество секунд в одной минуте.
     */
    private final static int MAX_SECONDS_IN_MINUTE = 60;

    /**
     * Вычисляет количество часов, минут и секунд,
     * пройденных к моменту указанной секунды.
     */
    public void calculatePastTime(int second) {

        /*
         * Количество секунд оставшихся после
         * вычисленных пройденных часов
         */
        short secondsAfterPastHours = calculatePastHours(second);

        pastSeconds = calculatePastMinutes(secondsAfterPastHours);
    }

    /**
     * Вычисляет количество часов,
     * пройденных к моменту указанной секунды.
     *
     * @param seconds количество секунд, для которых
     *                вычисляется количество часов
     * @return количество оставшихся секунд
     */
    private short calculatePastHours(int seconds) {
        pastHours = (byte) (seconds / MAX_SECONDS_IN_HOUR);

        return (short) (seconds % MAX_SECONDS_IN_HOUR);
    }

    /**
     * Вычисляет количество минут,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов.
     *
     * @param secondsAfterPastHours количество секунд, для которых
     *                              вычисляется количество минут
     * @return количество оставшихся секунд
     */
    private short calculatePastMinutes(short secondsAfterPastHours) {
        pastMinutes = (short) (secondsAfterPastHours / MAX_SECONDS_IN_MINUTE);

        return (short) (secondsAfterPastHours % MAX_SECONDS_IN_MINUTE);
    }

    public byte getPastHours() {
        return pastHours;
    }

    public short getPastMinutes() {
        return pastMinutes;
    }

    public short getPastSeconds() {
        return pastSeconds;
    }
}
