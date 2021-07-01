package by.epamtc.iovchuk.lesson1.task6.entity;

import by.epamtc.iovchuk.lesson1.task6.service.PastTimeService;

public class PastTime {

    /**
     * Количество часов,
     * пройденных к моменту указанной секунды.
     */
    private final byte pastHours;

    /**
     * Количество минут,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов.
     */
    private final short pastMinutes;

    /**
     * Количество секунд,
     * пройденных к моменту указанной секунды,
     * без учета пройденных часов и минут.
     */
    private final short pastSeconds;

    public PastTime(int seconds) {
        PastTimeService pastTimeService = new PastTimeService();

        //Количество пройденных часов
        pastHours = pastTimeService.calculatePastHours(seconds);

        //Количество секунд, оставшихся после пройденных часов
        seconds = pastTimeService
                .calcRemainingSecondsAfterPastHours(seconds);

        //Количество пройденных минут
        pastMinutes = pastTimeService.calculatePastMinutes(seconds);

        //Количество пройденных секунд
        pastSeconds = (short) pastTimeService.
                calcRemainingSecondsAfterPastMinutes(seconds);

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
