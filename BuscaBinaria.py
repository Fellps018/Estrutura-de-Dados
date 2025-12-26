def pesquisa_binaria(lista, item):
    baixo = 0 
    alto = len(lista) - 1
    while baixo <= alto: 
        meio = (baixo + alto) // 2  # Usar // para obter um índice inteiro
        chute = lista[meio]
        if chute == item:
            return meio
        if chute > item: # Se chute for maior, então:
            alto = meio - 1 #Alto fica com o valor de meio -1, para eliminar a parte de cima
        else: 
            baixo = meio + 1 #Aqui a mesma coisa, se for baixo, ele fica com valor de meio +1, para eliminar os de baixo
            
    return None  # Retornar None fora do loop

minha_lista = ["Felipe", "Gabreil", "João", "Marcos"]
print(minha_lista)
item = input("Qual posição de número deseja dessa lista: ")
print(pesquisa_binaria(minha_lista, item))

