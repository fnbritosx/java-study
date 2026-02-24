@echo off
color 0E
cls
echo ###########################################################
echo #             RESTAURANDO ESTADO DO BANCO                 #
echo ###########################################################
echo.
echo  ATENCAO: Os dados atuais do Docker serao substituidos
echo  pelo conteudo do arquivo ./sql/init.sql.
echo.
set /p choice="Deseja continuar? (S/N): "

if /i "%choice%" neq "S" (
    color 07
    echo.
    echo [INFO] Operacao cancelada.
    pause
    exit
)

echo.
color 0B
echo [1/2] Limpando banco atual...
docker-compose down -v
echo.
echo [2/2] Carregando dados do arquivo SQL...
docker-compose up -d
echo.
color 0A
echo ###########################################################
echo #           BANCO RESTAURADO COM SUCESSO!                 #
echo ###########################################################
pause