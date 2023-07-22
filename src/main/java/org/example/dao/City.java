package org.example.dao;

public class City {

    //id города
    private Integer id;

    //    name – наименование города
    private String name;

    //    region – регион
    private String region;

    //    district – федеральный округ
    private String district;

    //    population – количество жителей города
    private Integer population;

    //    foundation – дата основания или первое упоминание
    private String foundation;

    public City(String[] array) {
        if (!array[0].isEmpty()) {
            this.id = Integer.parseInt(array[0]);
        }
        if (!array[1].isEmpty()) {
            this.name = array[1];
        }
        if (!array[2].isEmpty()) {
            this.region = array[2];
        }
        if (!array[3].isEmpty()) {
            this.district = array[3];
        }
        if (!array[4].isEmpty()) {
            this.population = Integer.parseInt(array[4]);
        }
        if (array.length == 6 && !array[5].isEmpty()) {
            this.foundation = array[5];
        }
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}