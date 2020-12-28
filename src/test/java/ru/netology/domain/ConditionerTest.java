package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldIncreaseCurrentTemperatureFromMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(16);
        conditioner.increaseCurrentTemperature();

        assertEquals(17,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureFromAvg(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();

        assertEquals(24,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperatureFromMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();

        assertEquals(30,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureFromMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();

        assertEquals(29,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureFromAvg(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(23);
        conditioner.decreaseCurrentTemperature();

        assertEquals(22,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperatureFromMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("First");
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();

        assertEquals(16,conditioner.getCurrentTemperature());
    }
}