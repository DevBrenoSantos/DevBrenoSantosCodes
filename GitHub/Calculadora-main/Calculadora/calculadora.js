function calculadora(){
    const operacao = Number(prompt('Escolha uma operação:\n 1 - Soma \n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 5 - Potenciação '));

    if (!operacao || operacao > 5) {
        alert('[ERRO] OPERAÇÃO INVÁLIDA');
        calculadora();
    } else {

        
    
let n1 = Number(prompt('Insira o primeiro valor: '));
let n2 = Number(prompt('Insira o segundo valor: '));
let res;

if (!n1 || !n2){
    alert('[ERRO] VALOR INVALIDO')
    calculadora();
} else {

function soma() {
    res = n1 + n2
    alert (`${n1} + ${n2} = ${res}`)
    novaOperacao();
}

function subtracao() {
    res = n1 - n2
    alert (`${n1} - ${n2} = ${res}`)
    novaOperacao();
}

function multiplicacao() {
    res = n1 * n2
    alert (`${n1} * ${n2} = ${res}`)
    novaOperacao();
}

function divisao() {
    res = n1 / n2
    alert (`${n1} / ${n2} = ${res}`)
    novaOperacao();
}

function potenciacao() {
    res = n1 ** n2
    alert (`${n1} elevado a ${n2} é igual a ${res}`)
    novaOperacao();
}

function novaOperacao() {
    let opcao = prompt('Deseja continuar?\n 1 - Sim\n 2 - Não');

    if (opcao == 1) {
        calculadora();
    } else if (opcao == 2) {
        alert ('Obrigado, até mais!');

    } else {
        alert('[ERRO] DIGITE UMA OPÇAO')
        novaOperacao();
    }
}
        }

if(operacao == 1) {
    soma()
} else if (operacao == 2) {
    subtracao()
} else if(operacao == 3) {
    multiplicacao()
} else if(operacao == 4) {
    divisao()
} else if (operacao == 5) {
    potenciacao()
}

    }

}

calculadora()