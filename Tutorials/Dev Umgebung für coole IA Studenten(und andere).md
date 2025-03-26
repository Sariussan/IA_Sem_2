# Intro

Lokale Umgebung wird empfohlen(Vscode oder IntelliJ), trotzdem ist Vscode mit Java auch im Browser nutzbar, über einen Github Codespace, hier bekommt man eine virtuelle Maschine bei Github, die man verwenden kann - diese sollte man aber auch immer manuell an und ausschalten (Strom, Umwelt, Weltuntergang undso)

## Github Student Developer Pack

FREE STUFF(und wichtiger Stuff, nutzt es!)

1. Github Education Paket beantragen
   https://github.com/education
   -> Tha email angeben, mit Dokument verifizieren
   https://education.github.com/pack (Heres the free Stuff)

## Git

GIT(nicht zwingend notwendig aber von Simons empfohlen):

-   Git installieren:
    -   https://git-scm.com/downloads
    -   git setup
        git config --global user.name "Your Name Here"
        git config --global user.email "your_email@example.com"
-   Mega tolles Git Tutorial anschauen/sich geben lassen - Dokumentation https://git-scm.com/docs/gittutorial
-   Github Account + ein neues Git Repository anlegen -> zeug speichern können

## Development Umgebung

Dann entweder: - Github Codespace - Lokale Dev Umgebung - IntelliJ - Vscode + addons - ...

### Github Codespace

1. Codespace in Github erstellen
   1.-> online VScode, durch anmeldung sync von extensions und settings möglich

### Lokal:

Windows oder Mac OS sind hier möglich

#### Jetbrains IntelliJ (IDE)

-   JETBrains IntelliJ idea ultimate verwenden(komplette IDE)
    -   Bei https://account.jetbrains.com/login mit dem Github account von oben einloggen -> Freischaltung für Ultimate version
    -   https://www.jetbrains.com/de-de/idea/download IntelliJ runterladen
    -   installieren!
        -   Add "bin" folder to path -> auf jeden Fall aktivieren
        -   create associations -> gerne aktivieren
        -   add open folder as project -> aktivieren
        -   öffnen -> projekt erstellen mit java, ordner aussuchen(am besten einen gesonderten Überordner für alle Programmiersachen anlegen)
        -   Java installieren
            -   Unter Project Structure
            -   -   drücken -> Download jdk Optionen:
                    -   version 24 -> Oracle OpenJDK
                    -   Version 23 -> Azul Zulu Community (auch open Source)

#### VS Code

-   (WSL(Windows subsystem for Linux - kann auch verwendet werden um für Webtechnologien Linux zu installieren - kein Muss, VirtualBox ist auch schön)) 1. Terminal öffnen 2. wsl.exe --install
-   https://code.visualstudio.com/ herunterladen + installieren
    -   wenn programm zu groß oder zu klein gescaled: Oben links terminal aufmachen >
        code --disable-gpu
        in der command line ausführen + vscode neu aufmachen
-   lokale jdk benötigt (Java als Programm auf dem Rechner) - Empfehlung: - Java Version - https://www.azul.com/downloads/?package=jdk#zulu - https://openjdk.org/install/ (Oberfläche verwirrend, zulu is besser) - choco install(package manager auf windows, vorwissen benötigt, if you dont recognize it, you dont have it) - brew install(mac)
-   Extensions für VScode(viele auch für IntelliJ verfügbar - #):
    -   Java/Coding:
        -   https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack (Java entwicklungsumgebung)
        -   https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode (#Prettier - Code formatter)
    -   Git/Codeverwaltung
        -   https://marketplace.visualstudio.com/items?itemName=mhutchie.git-graph (Git Graph - Visualisierung für Git)
        -   https://marketplace.visualstudio.com/items?itemName=eamodio.gitlens (#GitLens - Tool für Git, mit Github education pro version kostenlos, ersetzt dann auch git graph)
    -   Orgatools
        -   https://marketplace.visualstudio.com/items?itemName=alefragnani.project-manager (Project manager - interessant um sich nicht im Chaos zu verlieren)
    -   Beautyfication:
        -   https://marketplace.visualstudio.com/items?itemName=RobbOwen.synthwave-vscode (#Synthwave 84 - Color theme, geht auch alles andere was NICHT lightmode ist, sonst haue)
        -   https://marketplace.visualstudio.com/items?itemName=emmanuelbeziat.vscode-great-icons (Icon pack)
    -   Cheating:
        -   https://marketplace.visualstudio.com/items?itemName=GitHub.copilot (Github Copilot, free mit Education - das beste AI Programming Modell)
        -   https://marketplace.visualstudio.com/items?itemName=GitHub.copilot-chat (Copilot Chat Client, gut nutzbar um sich Dinge erklären zu lassen)
    -   Wichtigstes Plugin:
        -   https://marketplace.visualstudio.com/items?itemName=tonybaloney.vscode-pets (kleine Pixelhaustiere in Vscode :) )
