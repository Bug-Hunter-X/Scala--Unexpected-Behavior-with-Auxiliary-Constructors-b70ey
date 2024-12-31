# Scala: Unexpected Behavior with Auxiliary Constructors

This repository demonstrates a common but subtle error in Scala involving the misuse of auxiliary constructors.  The error arises from incorrectly modifying a class variable after calling the primary constructor within an auxiliary constructor.

The `BuggyAuxiliaryConstructor.scala` file shows the problematic code.  The `CorrectedAuxiliaryConstructor.scala` file provides the corrected version.

## Problem
The issue occurs when an auxiliary constructor attempts to modify a variable after calling the primary constructor (`this()`). This modification is often ineffective.  The primary constructor's initialization takes precedence.

## Solution
The correct approach involves initializing all variables directly within the auxiliary constructor. Avoid calling the primary constructor and then attempting to modify values subsequently.