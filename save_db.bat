@echo off
color 0B
cls
echo ###########################################################
echo #              SALVANDO ESTADO DO BANCO                   #
echo ###########################################################
echo.
echo  Extraindo dados atuais do Docker para ./sql/init.sql...
echo.

docker exec mysql mysqldump -u root -proot anime_store > ./sql/init.sql

if %ERRORLEVEL% equ 0 (
    color 0A
    echo  [OK] Dados extraidos com sucesso!
    echo.
    echo  PROXIMO PASSO:
    echo  Faca o COMMIT e PUSH no Git para enviar ao outro PC.
) else (
    color 0C
    echo  [ERRO] Nao foi possivel acessar o Docker.
    echo  Verifique se o container 'mysql' esta rodando.
)

echo.
echo ###########################################################
pause