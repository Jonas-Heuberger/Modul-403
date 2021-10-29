package com.company;
import java.util.Scanner;

        class Main{
        public static void main(String [] args){

        System.out.println("geben Sie einen Zähler ein");
        double Zähler = Abfrage();
        System.out.println("geben Sie einen Nenner ein");
        double Nenner = Abfrage();
        double Dezimalzahl = dezimalZahl(Zähler, Nenner);
        Ausgabe(Dezimalzahl);
        double Prozentzahl = prozentZahl(Dezimalzahl);
        AusgabeProzent(Prozentzahl);
        System.out.println("Geben Sie eine Ganzzahl ein: ");
        double Ganzzahl = Abfrage();
        double BruchPlusGanzzahl = BruchPlusGanzzahl(Ganzzahl, Dezimalzahl);
        AusgabeProzentPlusGanzzahl(BruchPlusGanzzahl);
        }

                private static void AusgabeProzentPlusGanzzahl(double BruchPlusGanzzahl) {
                        System.out.println(BruchPlusGanzzahl);
                }
                
                private static double BruchPlusGanzzahl(double Ganzzahl, double Dezimalzahl) {
                        return Ganzzahl + Dezimalzahl;
                }

                private static double Abfrage() {
                Scanner scan = new Scanner(System.in);
                double Zahl = scan.nextInt();
                return Zahl;
                }

        private static double dezimalZahl(double Zähler, double Nenner){
        return Zähler / Nenner;
        }

        private static void Ausgabe(double Dezimalzahl){
        System.out.println("Dezimalzahl: " + Dezimalzahl);
        }
        private static double prozentZahl(double Dezimalzahl){
                return Dezimalzahl * 100;
        }

        private static void AusgabeProzent(double Prozentzahl){
                System.out.println("Prozentzahl: " + Prozentzahl + "%");
        }

        }
