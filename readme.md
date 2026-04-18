# Aula de Git e GitHub

## Comandos Git
- `git --version`: Retorna a versão do Git instalado.
- `git clone URL`: Cria uma cópia local de um repositório remoto.
- `git add .` : Adiciona os arquivos/modificações realizados no próximo commit.
- `git commit -m  "..."`: Criar o commit com uma mensagem descritiva
- `git log --oneline -n 2`: Retorna os dois últimos commits mais recentes de forma resumida.
- `git push origin main`: Envia seus commits do repositório local para o remoto (branch `main`).
- `git pull origin main`: Baixa os commits do repositório remoto para o local (branch `main`).
- `git checkout -b XYZ`: Cria uma nova branch de nome `XYZ`.
- `git status`: Exibe o status dos arquivos do projeto.

## Fluxo de Trabalho
1. Criar nova branch
2. Aplicar mudanças com commits atômicos
3. Enviar commits para o repositório remoto
4. Abrir _pull request_
5. Indicar revisores
6. Após revisão, dar o merge.

