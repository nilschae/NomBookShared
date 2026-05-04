# NomBook Benutzerhandbuch & App-Dokumentation

Dieses Dokument beschreibt alle Funktionen und Bedienelemente der NomBook-Applikation. Es dient sowohl als Referenz für Nutzer als auch als Wissensbasis für den KI-Assistenten.

## 1. Login & Registrierung
- **Login-Bildschirm**:
    - **E-Mail & Passwort Felder**: Eingabe der Zugangsdaten.
    - **Login Button**: Meldet den Nutzer an.
    - **Registrieren Link**: Wechselt zum Registrierungs-Bildschirm.
    - **Passwort vergessen**: Sendet einen Reset-Link an die E-Mail-Adresse.
- **Registrierung**:
    - **Nutzername, E-Mail, Passwort**: Erforderliche Daten.
    - **Registrieren Button**: Erstellt den Account.

## 2. Hauptbildschirm (MainActivity)
- **Header**:
    - **Settings (Zahnrad-Icon, oben links)**: Öffnet die App-Einstellungen.
    - **Suche (Lupen-Icon)**: Filtert die Rezepte-Liste nach Titeln.
    - **Sortierung (Icons oben rechts)**:
        - **Stern**: Sortiert nach Bewertung.
        - **A-Z**: Sortiert alphabetisch.
        - **Auge**: Sortiert nach Klicks (Beliebtheit).
        - **Pfeil hoch/runter**: Wechselt die Sortierreihenfolge.
    - **Kochbuch-Dropdown (Mitte oben)**: Wechselt zwischen Kochbüchern ("Alle Rezepte", "Privat", etc.).
- **Rezepte-Liste**:
    - **Rezept-Karte**: Klick öffnet das Rezept.
    - **Langer Klick**: Öffnet ein Kontextmenü (Teilen, Bearbeiten, Löschen, Verschieben).
- **Floating Action Buttons (FABs, unten)**:
    - **Plus-Button (Blau)**: Importiert ein Rezept über eine URL.
    - **Würfel-Button**: Wählt ein zufälliges Rezept aus.
    - **Tag-Button (Schild)**: Öffnet das Filtermenü für Tags.
    - **Edit-Button (Stift)**: Öffnet den manuellen Recipe Builder.

## 3. Rezeptansicht (RecipeView)
- **Navigation**: Zurück-Pfeil (oben links).
- **Aktionen (oben rechts)**:
    - **Teilen-Icon**: Generiert einen Bring!-Link oder Teilt das Rezept.
    - **Edit-Icon**: Bearbeitet das Rezept.
    - **Löschen-Icon**: Verschiebt das Rezept in den Papierkorb.
- **Inhalt**:
    - **Portions-Anpassung (+/-)**: Ändert die Zutatenmengen dynamisch.
    - **Bewertung (Sterne)**: Nutzer kann 1-5 Sterne vergeben.
    - **Tags (unten)**: Anzeige der Tags. Klick auf "+" fügt neue Tags hinzu.
    - **Nährwerte**: Button zum Berechnen oder Anzeigen der Nährwerte.

## 4. Einstellungen (Settings)
- **Tabs**:
    - **Profil**: Anzeigen/Ändern des Namens, Logout-Button, Account löschen.
    - **Gruppe**: Anzeigen der Mitglieder, Einladungslink erstellen, Gruppe verlassen.
    - **Rezepte**:
        - **Gelöschte Rezepte**: Öffnet den Papierkorb.
        - **Änderungsprotokoll**: Zeigt an, wer wann was geändert hat.
    - **Mitwirkende**: Credits und Version.

## 5. Papierkorb (WasteBin)
- **Wiederherstellen-Icon**: Schiebt das Rezept zurück ins Kochbuch.
- **Papierkorb-Icon**: Löscht das Rezept unwiderruflich vom Server.

## 6. Gruppe erstellen/beitreten
- **Gruppe erstellen**: Legt eine neue Gruppe mit einem Namen fest.
- **Gruppe beitreten**: Eingabe eines Einladungscodes, um einer bestehenden Gruppe beizutreten.

---

## Metadaten für den KI-Assistenten (Guide AI)
Der Assistent kann folgende Aktionen auslösen, indem er JSON-Kommandos in der Antwort zurückgibt:

### Verfügbare Aktionen:
1. `{"action": "open_settings", "tab": "recipes"}`
   - Tabs: `profile`, `group`, `recipes`, `credits`.
2. `{"action": "flash_button", "id": "BUTTON_ID"}`
   - IDs: `btn_deleted_recipes`, `btn_add_recipe`, `btn_random_recipe`, `btn_tags`, `btn_create_recipe`.
3. `{"action": "switch_activity", "activity": "CreateRecipe"}`

### Beispiel-Logik für "Wo sind gelöschte Rezepte?":
```json
{
  "message": "Deine gelöschten Rezepte findest du im Papierkorb. Ich öffne dir den Bereich direkt.",
  "commands": [
    {"action": "open_settings", "tab": "recipes"},
    {"action": "flash_button", "id": "btn_deleted_recipes"}
  ]
}
```
