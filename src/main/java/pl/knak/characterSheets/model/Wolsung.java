package pl.knak.characterSheets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Wolsung {
    public Wolsung() {
    }

    public Wolsung(String owner, String password, String name, String race, String nationality, String archetype,
                   String profession, int brawn, int dexterity, int sagacity, int calmness, int charisma, int analysis,
                   String analysisSpecialization, int bluff, String bluffSpecialization, int expression,
                   String expressionSpecialization, int empathy, String empathySpecialization, int courage,
                   String courageSpecialization, int occultism, String occultismSpecialization, int persuade,
                   String persuadeSpecialization, int underworld,
                   String underworldSpecialization, int vehicle, String vehicleSpecialization, int nature,
                   String natureSpecialization, int spot, String spotSpecialization, int shooting,
                   String shootingSpecialization, int technology, String technologySpecialization, int hide,
                   String hideSpecialization, int fighting, String fightingSpecialization, int knowledge,
                   String knowledgeSpecialization, int athletics, String athleticsSpecialization, int intimidation,
                   String intimidationSpecialization, int thievery, String thieverySpecialization, String raceAbilities,
                   String weakness, String professionAbilities, String recoverToken, String gadgets, String trump,
                   String allies, int wealth, String description, String scars, int xp, String achivmentA1, String achivmentA2,
                   String achivmentA3, String achivmentA4, String achivmentA5, String achivmentA6, String achivmentA7,
                   String achivmentA8, String achivmentA9, String achivmentA10, String achivmentA11,
                   String achivmentA12, String achivmentA13, String achivmentA14, String achivmentA15,
                   String achivmentB1, String achivmentB2, String achivmentB3, String achivmentB4, String achivmentB5,
                   String achivmentB6, String achivmentB7, String achivmentB8, String achivmentB9, String achivmentB10,
                   String achivmentB11, String achivmentB12, String achivmentB13, String achivmentB14,
                   String achivmentB15, String achivmentC1, String achivmentC2, String achivmentC3, String achivmentC4,
                   String achivmentC5, String achivmentC6, String achivmentC7, String achivmentC8, String achivmentC9,
                   String achivmentC10, String achivmentC11, String achivmentC12, String achivmentC13,
                   String achivmentC14, String achivmentC15) {
        this.owner = owner;
        this.password = password;
        this.name = name;
        this.race = race;
        this.nationality = nationality;
        this.archetype = archetype;
        this.profession = profession;
        this.brawn = brawn;
        this.dexterity = dexterity;
        this.sagacity = sagacity;
        this.calmness = calmness;
        this.charisma = charisma;
        this.analysis = analysis;
        this.analysisSpecialization = analysisSpecialization;
        this.bluff = bluff;
        this.bluffSpecialization = bluffSpecialization;
        this.expression = expression;
        this.expressionSpecialization = expressionSpecialization;
        this.empathy = empathy;
        this.empathySpecialization = empathySpecialization;
        this.courage = courage;
        this.courageSpecialization = courageSpecialization;
        this.occultism = occultism;
        this.occultismSpecialization = occultismSpecialization;
        this.persuade = persuade;
        this.persuadeSpecialization = persuadeSpecialization;
        this.underworld = underworld;
        this.underworldSpecialization = underworldSpecialization;
        this.vehicle = vehicle;
        this.vehicleSpecialization = vehicleSpecialization;
        this.nature = nature;
        this.natureSpecialization = natureSpecialization;
        this.spot = spot;
        this.spotSpecialization = spotSpecialization;
        this.shooting = shooting;
        this.shootingSpecialization = shootingSpecialization;
        this.technology = technology;
        this.technologySpecialization = technologySpecialization;
        this.hide = hide;
        this.hideSpecialization = hideSpecialization;
        this.fighting = fighting;
        this.fightingSpecialization = fightingSpecialization;
        this.knowledge = knowledge;
        this.knowledgeSpecialization = knowledgeSpecialization;
        this.athletics = athletics;
        this.athleticsSpecialization = athleticsSpecialization;
        this.intimidation = intimidation;
        this.intimidationSpecialization = intimidationSpecialization;
        this.thievery = thievery;
        this.thieverySpecialization = thieverySpecialization;
        this.raceAbilities = raceAbilities;
        this.weakness = weakness;
        this.professionAbilities = professionAbilities;
        this.recoverToken = recoverToken;
        this.gadgets = gadgets;
        this.trump = trump;
        this.allies = allies;
        this.wealth = wealth;
        this.xp = xp;
        this.description = description;
        this.scars = scars;
        this.achivmentA1 = achivmentA1;
        this.achivmentA2 = achivmentA2;
        this.achivmentA3 = achivmentA3;
        this.achivmentA4 = achivmentA4;
        this.achivmentA5 = achivmentA5;
        this.achivmentA6 = achivmentA6;
        this.achivmentA7 = achivmentA7;
        this.achivmentA8 = achivmentA8;
        this.achivmentA9 = achivmentA9;
        this.achivmentA10 = achivmentA10;
        this.achivmentA11 = achivmentA11;
        this.achivmentA12 = achivmentA12;
        this.achivmentA13 = achivmentA13;
        this.achivmentA14 = achivmentA14;
        this.achivmentA15 = achivmentA15;
        this.achivmentB1 = achivmentB1;
        this.achivmentB2 = achivmentB2;
        this.achivmentB3 = achivmentB3;
        this.achivmentB4 = achivmentB4;
        this.achivmentB5 = achivmentB5;
        this.achivmentB6 = achivmentB6;
        this.achivmentB7 = achivmentB7;
        this.achivmentB8 = achivmentB8;
        this.achivmentB9 = achivmentB9;
        this.achivmentB10 = achivmentB10;
        this.achivmentB11 = achivmentB11;
        this.achivmentB12 = achivmentB12;
        this.achivmentB13 = achivmentB13;
        this.achivmentB14 = achivmentB14;
        this.achivmentB15 = achivmentB15;
        this.achivmentC1 = achivmentC1;
        this.achivmentC2 = achivmentC2;
        this.achivmentC3 = achivmentC3;
        this.achivmentC4 = achivmentC4;
        this.achivmentC5 = achivmentC5;
        this.achivmentC6 = achivmentC6;
        this.achivmentC7 = achivmentC7;
        this.achivmentC8 = achivmentC8;
        this.achivmentC9 = achivmentC9;
        this.achivmentC10 = achivmentC10;
        this.achivmentC11 = achivmentC11;
        this.achivmentC12 = achivmentC12;
        this.achivmentC13 = achivmentC13;
        this.achivmentC14 = achivmentC14;
        this.achivmentC15 = achivmentC15;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String owner;
    private String password;
    private String name;
    private String race;
    private String nationality;
    private String archetype;
    private String profession;

    private int brawn;
    private int dexterity;
    private int sagacity;
    private int calmness;
    private int charisma;

    private int analysis;
    private String analysisSpecialization;
    private int bluff;
    private String bluffSpecialization;
    private int expression;
    private String expressionSpecialization;
    private int empathy;
    private String empathySpecialization;
    private int courage;
    private String courageSpecialization;
    private int occultism;
    private String occultismSpecialization;
    private int persuade;
    private String persuadeSpecialization;
    private int underworld;
    private String underworldSpecialization;
    private int vehicle;
    private String vehicleSpecialization;
    private int nature;
    private String natureSpecialization;
    private int spot;
    private String spotSpecialization;
    private int shooting;
    private String shootingSpecialization;
    private int technology;
    private String technologySpecialization;
    private int hide;
    private String hideSpecialization;
    private int fighting;
    private String fightingSpecialization;
    private int knowledge;
    private String knowledgeSpecialization;
    private int athletics;
    private String athleticsSpecialization;
    private int intimidation;
    private String intimidationSpecialization;
    private int thievery;
    private String thieverySpecialization;

    private String raceAbilities;
    private String weakness;
    private String professionAbilities;
    private String recoverToken;

    private String gadgets;
    private String trump;
    private String allies;

    private int wealth;
    private int xp;
    private String description;
    private String scars;

    private String achivmentA1;
    private String achivmentA2;
    private String achivmentA3;
    private String achivmentA4;
    private String achivmentA5;
    private String achivmentA6;
    private String achivmentA7;
    private String achivmentA8;
    private String achivmentA9;
    private String achivmentA10;
    private String achivmentA11;
    private String achivmentA12;
    private String achivmentA13;
    private String achivmentA14;
    private String achivmentA15;

    private String achivmentB1;
    private String achivmentB2;
    private String achivmentB3;
    private String achivmentB4;
    private String achivmentB5;
    private String achivmentB6;
    private String achivmentB7;
    private String achivmentB8;
    private String achivmentB9;
    private String achivmentB10;
    private String achivmentB11;
    private String achivmentB12;
    private String achivmentB13;
    private String achivmentB14;
    private String achivmentB15;

    private String achivmentC1;
    private String achivmentC2;
    private String achivmentC3;
    private String achivmentC4;
    private String achivmentC5;
    private String achivmentC6;
    private String achivmentC7;
    private String achivmentC8;
    private String achivmentC9;
    private String achivmentC10;
    private String achivmentC11;
    private String achivmentC12;
    private String achivmentC13;
    private String achivmentC14;
    private String achivmentC15;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getBrawn() {
        return brawn;
    }

    public void setBrawn(int brawn) {
        this.brawn = brawn;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSagacity() {
        return sagacity;
    }

    public void setSagacity(int sagacity) {
        this.sagacity = sagacity;
    }

    public int getCalmness() {
        return calmness;
    }

    public void setCalmness(int calmness) {
        this.calmness = calmness;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getAnalysis() {
        return analysis;
    }

    public void setAnalysis(int analysis) {
        this.analysis = analysis;
    }

    public String getAnalysisSpecialization() {
        return analysisSpecialization;
    }

    public void setAnalysisSpecialization(String analysisSpecialization) {
        this.analysisSpecialization = analysisSpecialization;
    }

    public int getBluff() {
        return bluff;
    }

    public void setBluff(int bluff) {
        this.bluff = bluff;
    }

    public String getBluffSpecialization() {
        return bluffSpecialization;
    }

    public void setBluffSpecialization(String bluffSpecialization) {
        this.bluffSpecialization = bluffSpecialization;
    }

    public int getExpression() {
        return expression;
    }

    public void setExpression(int expression) {
        this.expression = expression;
    }

    public String getExpressionSpecialization() {
        return expressionSpecialization;
    }

    public void setExpressionSpecialization(String expressionSpecialization) {
        this.expressionSpecialization = expressionSpecialization;
    }

    public int getEmpathy() {
        return empathy;
    }

    public void setEmpathy(int empathy) {
        this.empathy = empathy;
    }

    public String getEmpathySpecialization() {
        return empathySpecialization;
    }

    public void setEmpathySpecialization(String empathySpecialization) {
        this.empathySpecialization = empathySpecialization;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String getCourageSpecialization() {
        return courageSpecialization;
    }

    public void setCourageSpecialization(String courageSpecialization) {
        this.courageSpecialization = courageSpecialization;
    }

    public int getOccultism() {
        return occultism;
    }

    public void setOccultism(int occultism) {
        this.occultism = occultism;
    }

    public String getOccultismSpecialization() {
        return occultismSpecialization;
    }

    public void setOccultismSpecialization(String occultismSpecialization) {
        this.occultismSpecialization = occultismSpecialization;
    }

    public int getUnderworld() {
        return underworld;
    }

    public void setUnderworld(int underworld) {
        this.underworld = underworld;
    }

    public String getUnderworldSpecialization() {
        return underworldSpecialization;
    }

    public void setUnderworldSpecialization(String underworldSpecialization) {
        this.underworldSpecialization = underworldSpecialization;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleSpecialization() {
        return vehicleSpecialization;
    }

    public void setVehicleSpecialization(String vehicleSpecialization) {
        this.vehicleSpecialization = vehicleSpecialization;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public String getNatureSpecialization() {
        return natureSpecialization;
    }

    public void setNatureSpecialization(String natureSpecialization) {
        this.natureSpecialization = natureSpecialization;
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

    public String getSpotSpecialization() {
        return spotSpecialization;
    }

    public void setSpotSpecialization(String spotSpecialization) {
        this.spotSpecialization = spotSpecialization;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public String getShootingSpecialization() {
        return shootingSpecialization;
    }

    public void setShootingSpecialization(String shootingSpecialization) {
        this.shootingSpecialization = shootingSpecialization;
    }

    public int getTechnology() {
        return technology;
    }

    public void setTechnology(int technology) {
        this.technology = technology;
    }

    public String getTechnologySpecialization() {
        return technologySpecialization;
    }

    public void setTechnologySpecialization(String technologySpecialization) {
        this.technologySpecialization = technologySpecialization;
    }

    public int getHide() {
        return hide;
    }

    public void setHide(int hide) {
        this.hide = hide;
    }

    public String getHideSpecialization() {
        return hideSpecialization;
    }

    public void setHideSpecialization(String hideSpecialization) {
        this.hideSpecialization = hideSpecialization;
    }

    public int getFighting() {
        return fighting;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public String getFightingSpecialization() {
        return fightingSpecialization;
    }

    public void setFightingSpecialization(String fightingSpecialization) {
        this.fightingSpecialization = fightingSpecialization;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getKnowledgeSpecialization() {
        return knowledgeSpecialization;
    }

    public void setKnowledgeSpecialization(String knowledgeSpecialization) {
        this.knowledgeSpecialization = knowledgeSpecialization;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public String getAthleticsSpecialization() {
        return athleticsSpecialization;
    }

    public void setAthleticsSpecialization(String athleticsSpecialization) {
        this.athleticsSpecialization = athleticsSpecialization;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public String getIntimidationSpecialization() {
        return intimidationSpecialization;
    }

    public void setIntimidationSpecialization(String intimidationSpecialization) {
        this.intimidationSpecialization = intimidationSpecialization;
    }

    public int getThievery() {
        return thievery;
    }

    public void setThievery(int thievery) {
        this.thievery = thievery;
    }

    public String getThieverySpecialization() {
        return thieverySpecialization;
    }

    public void setThieverySpecialization(String thieverySpecialization) {
        this.thieverySpecialization = thieverySpecialization;
    }

    public String getRaceAbilities() {
        return raceAbilities;
    }

    public void setRaceAbilities(String raceAbilities) {
        this.raceAbilities = raceAbilities;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getProfessionAbilities() {
        return professionAbilities;
    }

    public void setProfessionAbilities(String professionAbilities) {
        this.professionAbilities = professionAbilities;
    }

    public String getRecoverToken() {
        return recoverToken;
    }

    public void setRecoverToken(String recoverToken) {
        this.recoverToken = recoverToken;
    }

    public String getGadgets() {
        return gadgets;
    }

    public void setGadgets(String gadgets) {
        this.gadgets = gadgets;
    }

    public String getTrump() {
        return trump;
    }

    public void setTrump(String trump) {
        this.trump = trump;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScars() { return scars; }

    public void setScars(String scars) { this.scars = scars; }

    public String getAchivmentA1() {
        return achivmentA1;
    }

    public void setAchivmentA1(String achivmentA1) {
        this.achivmentA1 = achivmentA1;
    }

    public String getAchivmentA2() {
        return achivmentA2;
    }

    public void setAchivmentA2(String achivmentA2) {
        this.achivmentA2 = achivmentA2;
    }

    public String getAchivmentA3() {
        return achivmentA3;
    }

    public void setAchivmentA3(String achivmentA3) {
        this.achivmentA3 = achivmentA3;
    }

    public String getAchivmentA4() {
        return achivmentA4;
    }

    public void setAchivmentA4(String achivmentA4) {
        this.achivmentA4 = achivmentA4;
    }

    public String getAchivmentA5() {
        return achivmentA5;
    }

    public void setAchivmentA5(String achivmentA5) {
        this.achivmentA5 = achivmentA5;
    }

    public String getAchivmentA6() {
        return achivmentA6;
    }

    public void setAchivmentA6(String achivmentA6) {
        this.achivmentA6 = achivmentA6;
    }

    public String getAchivmentA7() {
        return achivmentA7;
    }

    public void setAchivmentA7(String achivmentA7) {
        this.achivmentA7 = achivmentA7;
    }

    public String getAchivmentA8() {
        return achivmentA8;
    }

    public void setAchivmentA8(String achivmentA8) {
        this.achivmentA8 = achivmentA8;
    }

    public String getAchivmentA9() {
        return achivmentA9;
    }

    public void setAchivmentA9(String achivmentA9) {
        this.achivmentA9 = achivmentA9;
    }

    public String getAchivmentA10() {
        return achivmentA10;
    }

    public void setAchivmentA10(String achivmentA10) {
        this.achivmentA10 = achivmentA10;
    }

    public String getAchivmentA11() {
        return achivmentA11;
    }

    public void setAchivmentA11(String achivmentA11) {
        this.achivmentA11 = achivmentA11;
    }

    public String getAchivmentA12() {
        return achivmentA12;
    }

    public void setAchivmentA12(String achivmentA12) {
        this.achivmentA12 = achivmentA12;
    }

    public String getAchivmentA13() {
        return achivmentA13;
    }

    public void setAchivmentA13(String achivmentA13) {
        this.achivmentA13 = achivmentA13;
    }

    public String getAchivmentA14() {
        return achivmentA14;
    }

    public void setAchivmentA14(String achivmentA14) {
        this.achivmentA14 = achivmentA14;
    }

    public String getAchivmentA15() {
        return achivmentA15;
    }

    public void setAchivmentA15(String achivmentA15) {
        this.achivmentA15 = achivmentA15;
    }

    public String getAchivmentB1() {
        return achivmentB1;
    }

    public void setAchivmentB1(String achivmentB1) {
        this.achivmentB1 = achivmentB1;
    }

    public String getAchivmentB2() {
        return achivmentB2;
    }

    public void setAchivmentB2(String achivmentB2) {
        this.achivmentB2 = achivmentB2;
    }

    public String getAchivmentB3() {
        return achivmentB3;
    }

    public void setAchivmentB3(String achivmentB3) {
        this.achivmentB3 = achivmentB3;
    }

    public String getAchivmentB4() {
        return achivmentB4;
    }

    public void setAchivmentB4(String achivmentB4) {
        this.achivmentB4 = achivmentB4;
    }

    public String getAchivmentB5() {
        return achivmentB5;
    }

    public void setAchivmentB5(String achivmentB5) {
        this.achivmentB5 = achivmentB5;
    }

    public String getAchivmentB6() {
        return achivmentB6;
    }

    public void setAchivmentB6(String achivmentB6) {
        this.achivmentB6 = achivmentB6;
    }

    public String getAchivmentB7() {
        return achivmentB7;
    }

    public void setAchivmentB7(String achivmentB7) {
        this.achivmentB7 = achivmentB7;
    }

    public String getAchivmentB8() {
        return achivmentB8;
    }

    public void setAchivmentB8(String achivmentB8) {
        this.achivmentB8 = achivmentB8;
    }

    public String getAchivmentB9() {
        return achivmentB9;
    }

    public void setAchivmentB9(String achivmentB9) {
        this.achivmentB9 = achivmentB9;
    }

    public String getAchivmentB10() {
        return achivmentB10;
    }

    public void setAchivmentB10(String achivmentB10) {
        this.achivmentB10 = achivmentB10;
    }

    public String getAchivmentB11() {
        return achivmentB11;
    }

    public void setAchivmentB11(String achivmentB11) {
        this.achivmentB11 = achivmentB11;
    }

    public String getAchivmentB12() {
        return achivmentB12;
    }

    public void setAchivmentB12(String achivmentB12) {
        this.achivmentB12 = achivmentB12;
    }

    public String getAchivmentB13() {
        return achivmentB13;
    }

    public void setAchivmentB13(String achivmentB13) {
        this.achivmentB13 = achivmentB13;
    }

    public String getAchivmentB14() {
        return achivmentB14;
    }

    public void setAchivmentB14(String achivmentB14) {
        this.achivmentB14 = achivmentB14;
    }

    public String getAchivmentB15() {
        return achivmentB15;
    }

    public void setAchivmentB15(String achivmentB15) {
        this.achivmentB15 = achivmentB15;
    }

    public String getAchivmentC1() {
        return achivmentC1;
    }

    public void setAchivmentC1(String achivmentC1) {
        this.achivmentC1 = achivmentC1;
    }

    public String getAchivmentC2() {
        return achivmentC2;
    }

    public void setAchivmentC2(String achivmentC2) {
        this.achivmentC2 = achivmentC2;
    }

    public String getAchivmentC3() {
        return achivmentC3;
    }

    public void setAchivmentC3(String achivmentC3) {
        this.achivmentC3 = achivmentC3;
    }

    public String getAchivmentC4() {
        return achivmentC4;
    }

    public void setAchivmentC4(String achivmentC4) {
        this.achivmentC4 = achivmentC4;
    }

    public String getAchivmentC5() {
        return achivmentC5;
    }

    public void setAchivmentC5(String achivmentC5) {
        this.achivmentC5 = achivmentC5;
    }

    public String getAchivmentC6() {
        return achivmentC6;
    }

    public void setAchivmentC6(String achivmentC6) {
        this.achivmentC6 = achivmentC6;
    }

    public String getAchivmentC7() {
        return achivmentC7;
    }

    public void setAchivmentC7(String achivmentC7) {
        this.achivmentC7 = achivmentC7;
    }

    public String getAchivmentC8() {
        return achivmentC8;
    }

    public void setAchivmentC8(String achivmentC8) {
        this.achivmentC8 = achivmentC8;
    }

    public String getAchivmentC9() {
        return achivmentC9;
    }

    public void setAchivmentC9(String achivmentC9) {
        this.achivmentC9 = achivmentC9;
    }

    public String getAchivmentC10() {
        return achivmentC10;
    }

    public void setAchivmentC10(String achivmentC10) {
        this.achivmentC10 = achivmentC10;
    }

    public String getAchivmentC11() {
        return achivmentC11;
    }

    public void setAchivmentC11(String achivmentC11) {
        this.achivmentC11 = achivmentC11;
    }

    public String getAchivmentC12() {
        return achivmentC12;
    }

    public void setAchivmentC12(String achivmentC12) {
        this.achivmentC12 = achivmentC12;
    }

    public String getAchivmentC13() {
        return achivmentC13;
    }

    public void setAchivmentC13(String achivmentC13) {
        this.achivmentC13 = achivmentC13;
    }

    public String getAchivmentC14() {
        return achivmentC14;
    }

    public void setAchivmentC14(String achivmentC14) {
        this.achivmentC14 = achivmentC14;
    }

    public String getAchivmentC15() {
        return achivmentC15;
    }

    public void setAchivmentC15(String achivmentC15) {
        this.achivmentC15 = achivmentC15;
    }

    public int getPersuade() {
        return persuade;
    }

    public void setPersuade(int persuade) {
        this.persuade = persuade;
    }

    public String getPersuadeSpecialization() {
        return persuadeSpecialization;
    }

    public void setPersuadeSpecialization(String persuadeSpecialization) { this.persuadeSpecialization = persuadeSpecialization; }

    public int getXp() { return xp; }

    public void setXp(int xp) { this.xp = xp; }
}

