# HeartSniperFabric

Automatyczny mod na Fabric 1.20 do snajpowania serc (i innych itemów) na rynku /ah.

## Funkcje
- Automatyczne filtrowanie, sortowanie, kupowanie i potwierdzanie zakupu przez GUI
- Konfigurowalny UUID, itemy, sloty GUI i cena w pliku `config.json`
- Logowanie zakupów do pliku tekstowego (`sniper_log.txt`), opcjonalne
- Uruchamianie/wyłączanie snajpera klawiszem P

## Instalacja
1. Skopiuj pliki do repozytorium:
   - `config.json` do głównego katalogu
   - kod Java do `src/main/java/com/johnnytrapotti/heartsnipermod/`
2. Skonfiguruj `config.json` według swoich potrzeb.
3. Zbuduj moda przez Fabric.

## Konfiguracja
Edytuj `config.json`:
- Dodaj/zmień itemy, sloty GUI, UUID, cenę, opcję logowania.

## Log
Jeśli `log_to_file` jest `true`, zakupy będą zapisywane do `sniper_log.txt`.

## Kontakt
Wszelkie pytania zgłaszaj przez Issues na GitHubie.