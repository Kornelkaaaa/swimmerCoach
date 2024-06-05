# Swim Coach Application

## Description

This is a simple Java application designed to recommend the number of training units for swimmers based on their age. The application takes the swimmer's first name, surname, and age as input and provides a recommendation for the number of training units.

## Features

- Input the swimmer's first name, surname, and age.
- Calculate the recommended number of training units based on age.
- Provide a message indicating the recommended training units or if the age is outside the valid range.

## Requirements

- Java 8 or higher

## Classes
Swimmer
The Swimmer class encapsulates the data for a swimmer, including their first name, surname, age, and recommended training units. It contains the following methods:

- Swimmer(String name, String surname, int age): Constructor that initializes the swimmer's information and calculates the training units.
- String getName(): Returns the swimmer's first name.
- String getSurname(): Returns the swimmer's surname.
- int getAge(): Returns the swimmer's age.
- int getTrainingUnits(): Returns the recommended number of training units.
- String toString(): Returns a string representation of the swimmer's information and training recommendation.
swimCoachDriver

The swimCoachDriver class contains the main method which handles user input and creates a Swimmer object to provide the training recommendation.

## License
This project is licensed under the MIT License.


