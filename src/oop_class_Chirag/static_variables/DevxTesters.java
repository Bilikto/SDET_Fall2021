package oop_class_Chirag.static_variables;

public class DevxTesters {

    public static void main(String[] args) {

        DevXSchool devXSchool1 = new DevXSchool();
        DevXSchool devXSchool2 = new DevXSchool();
        DevXSchool devXSchool3 = new DevXSchool();

        devXSchool1.jb  = "JavaBots1";
        devXSchool1.ut  = "UniqueTeam1";

        devXSchool2.jb  = "JavaBots2";
        devXSchool2.ut  = "UniqueTeam2";

        devXSchool3.jb  = "JavaBots3";
        devXSchool3.ut  = "UniqueTeam3";

        devXSchool1.printGroups();
        devXSchool2.printGroups();
        devXSchool3.printGroups();





    }
}
