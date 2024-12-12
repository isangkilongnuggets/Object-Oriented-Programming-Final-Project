# I. Project Overview

PerFoot is a personal footprint tracker that helps you monitor your environmental impact by estimating the carbon footprint of your daily activities. This categorizes your activities into Transportation, Food, and Household, providing insights into how each choice contributes to your carbon emissions.

# II. Explanation of how OOP principles were applied

## 1. Encapsulation

- Through the use of private access modifier to prevent direct access of the attributes (variables) from outside of the class and with the use of getters and setters. For example, in `Subcategory` class, the its attributes named `name`, `carbon_emission_per_unit`, and `unit` are declared as private with getters and setters for each attributes.

## 2. Inheritance

- The abstract class serves as a template for its subclasses containing necessary methods to characterized its subclasses. For example, the abstract class `Category` with its subclasses: `Transportation`, `Food`, and `Household`.

## 3. Polymorphism

- Method overriding, similarly to inheritance the abstract class `Category` and its subclasses `Transportation`, `Food`, and `Household` overrides the public abstract method `calculate_total_carbon_emission()`.

## 4. Abstraction

- Similar to inheritence and polymorphism it was applied to the abstract class `Category` which serves as the blueprint for its subclasses and hides other details inside the `Category`, like the calculation of total carbon emission named `calculate_total_carbon_emission()`.

# III. SDG and Its Integration into the Project

**SDG 13: Climate Action**  
**Target 13.3**: Improve education, awareness-raising, and human and institutional capacity on climate change mitigation, adaptation, impact reduction, and early warning.

The program helps individuals track their personal carbon footprint, raising awareness about the impact of daily activities on climate change. By increasing users' awareness of their emissions, it encourages more sustainable practices, contributing to climate action.

# IV. Instructions for Running the Program

1. Download the java file named `Perfoot.java` and save it to preferred folder.
2. Open the `Perfoot.java` in Visual Studio Code, then run te program.
