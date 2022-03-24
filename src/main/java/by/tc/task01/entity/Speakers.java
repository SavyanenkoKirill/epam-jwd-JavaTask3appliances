package main.java.by.tc.task01.entity;

import main.java.by.tc.task01.entity.feature.PowerConsuming;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers extends PowerConsuming {
    private int numbersOfSpeakers = 2;
    private double frequencyRangeLowerBound;
    private double frequencyRangeUpperBound;
    private double cordLength;

    public Speakers(double powerConsumption, int numbersOfSpeakers,
                    double frequencyRangeLowerBound, double frequencyRangeUpperBound, double cordLength) {
        super(powerConsumption);
        this.numbersOfSpeakers = numbersOfSpeakers;
        this.frequencyRangeUpperBound = frequencyRangeUpperBound;
        this.frequencyRangeLowerBound = frequencyRangeLowerBound;
        this.cordLength = cordLength;
    }

    public Speakers(double powerConsumption,
                    double frequencyRangeLowerBound, double frequencyRangeUpperBound, double cordLength) {
        super(powerConsumption);
        this.frequencyRangeUpperBound = frequencyRangeUpperBound;
        this.frequencyRangeLowerBound = frequencyRangeLowerBound;
        this.cordLength = cordLength;
    }

    @Override
    public Map<String, Object> getCharacteristics() {
        Map<String, Object> characteristics = new HashMap<>();
        characteristics.put("POWER_CONSUMPTION", getPowerConsumption());
        characteristics.put("NUMBER_OF_SPEAKERS", numbersOfSpeakers);
        characteristics.put("FREQUENCY_RANGE", formatRangeBound(frequencyRangeLowerBound) + "-" + formatRangeBound(frequencyRangeUpperBound));
        characteristics.put("CORD_LENGTH", cordLength);
        return characteristics;
    }

    private String formatRangeBound(double frequencyBound) {
        return (frequencyBound == (long) frequencyBound) ? String.format("%d", (long) frequencyBound) : String.format("%s",frequencyBound);
    }

    public int getNumbersOfSpeakers() {
        return numbersOfSpeakers;
    }

    public void setNumbersOfSpeakers(int numbersOfSpeakers) {
        this.numbersOfSpeakers = numbersOfSpeakers;
    }

    public double getFrequencyRangeLowerBound() {
        return frequencyRangeLowerBound;
    }

    public void setFrequencyRangeLowerBound(double frequencyRangeLowerBound) {
        this.frequencyRangeLowerBound = frequencyRangeLowerBound;
    }

    public double getFrequencyRangeUpperBound() {
        return frequencyRangeUpperBound;
    }

    public void setFrequencyRangeUpperBound(double frequencyRangeUpperBound) {
        this.frequencyRangeUpperBound = frequencyRangeUpperBound;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return numbersOfSpeakers == speakers.numbersOfSpeakers && Double.compare(speakers.frequencyRangeLowerBound, frequencyRangeLowerBound) == 0 && Double.compare(speakers.frequencyRangeUpperBound, frequencyRangeUpperBound) == 0 && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbersOfSpeakers, frequencyRangeLowerBound, frequencyRangeUpperBound, cordLength);
    }
}
