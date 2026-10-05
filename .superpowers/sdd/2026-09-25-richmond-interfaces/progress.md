# SDD ledger — plan: docs/superpowers/plans/2026-09-25-richmond-interfaces.md

Ruling: Work in the project directory — the workspace is not a Git repository, so a Git worktree cannot be created; the user explicitly directed changes to this project — cost if wrong: no isolated rollback branch.

Pre-flight: Task 1 Login → Task 2 Registro: Crear cuenta opens Registro — compatible, preserve JFrame owner.
Pre-flight: Task 1 Login → Task 3 Principal: Entrar opens Principal — compatible, Principal is a JDialog per the user's latest instruction.
Pre-flight: Task 3 Principal → Task 4 NuevoFormulario and Task 5 Resultados: menu buttons open their dialogs — compatible.
Pre-flight: Task 5 Resultados → Task 6 GraficoUno/GraficoDos: chart buttons open modal dialogs owned by Resultados — compatible via Dialog-owner JDialog constructors.

Ruling: Use NetBeans AbsoluteLayout for the fixed-size visual forms and retain the NetBeans AbsoluteLayout classpath dependency — the PDF screenshots place components at fixed coordinates and the GUI Builder writes that layout to editable `.form` files — cost if the dependency is unavailable outside this NetBeans installation: the project will need its AbsoluteLayout library registered.
Ruling: Make Principal resize its background regions and recenter its two buttons when the dialog is resized — preserves the user-requested JDialog type and the PDF's responsive layout — cost if the listener is wrong: controls could shift at non-default window sizes.
Task 4 Ruling: Use MUCHO/BASTANTE/ALGO/NADA for question 3 as drawn on PDF page 3; page 9 gives Sí/Probable/Dudoso/No — the user prioritizes matching the interface image, and this change is visual-only — cost if wrong: the survey's displayed labels won't match the page 9 scoring description.

Task 1: in progress
