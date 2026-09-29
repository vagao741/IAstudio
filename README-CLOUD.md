# IA Studio — compilação em nuvem

Este projeto já contém um GitHub Actions workflow em:
`.github/workflows/build-apk.yml`

No GitHub:
1. Crie um repositório novo.
2. Envie todos os arquivos deste projeto.
3. Abra a aba **Actions**.
4. Selecione **Build IA Studio APK**.
5. Execute o workflow.
6. Quando terminar, abra a execução concluída.
7. Na área **Artifacts**, baixe `IAStudio-debug-apk`.
8. Extraia o arquivo e instale `app-debug.apk` no Android.

Observação: esta versão gera o APK da interface. As funções de IA ainda precisam de APIs/backend para gerar conteúdo de verdade.
