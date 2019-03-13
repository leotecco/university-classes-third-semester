using System;
using System.Collections;
using System.Collections.Generic;

namespace estacionamento
{
    class Program
    {
        static void Main(string[] args)
        {
            int tamanhoEstacionamento = 4;
            Stack<string> estacionamento = new Stack<string>();
            string operacao = "";
            string placaCarro = "";

            while (true)
            {
                Console.WriteLine("ENTRADA(E) OU SAIDA(S): ");
                operacao = Console.ReadLine();
                if (operacao == "E")
                {
                    Console.WriteLine("PLACA DO CARRO: ");
                    placaCarro = Console.ReadLine();
                    if (Program.adicionarNoEstacionamento(estacionamento, tamanhoEstacionamento, placaCarro))
                    {
                        Console.WriteLine("CARRO ADICIONADO COM SUCESSO NO ESTACIONAMENTO");
                    }
                    else
                    {
                        Console.WriteLine("LIMITE DO ESTACIONAMENTO EXCEDIDO");
                    }
                }
                else if (operacao == "S")
                {
                    Console.WriteLine("PLACA DO CARRO: ");
                    placaCarro = Console.ReadLine();

                    if (Program.removerCarro(estacionamento, placaCarro))
                    {
                        Console.WriteLine("CARRO REMOVIDO COM SUCESSO DO ESTACIONAMENTO");
                    }
                    else
                    {
                        Console.WriteLine("CARRO NAO ENCONTRADO NO ESTACIONAMENTO");
                    }
                }
            }
        }

        static bool adicionarNoEstacionamento(Stack<string> estacionamento, int tamanhoEstacionamento, string placaCarro)
        {
            if (estacionamento.Count == tamanhoEstacionamento)
            {
                return false;
            }

            estacionamento.Push(placaCarro);
            return true;
        }

        static bool removerCarro(Stack<string> estacionamento, string placaCarro)
        {
            Stack<string> stackTemp = new Stack<string>();
            bool elementoEncontrado = false;

            while (estacionamento.Count > 0 && !elementoEncontrado)
            {
                string stringTemp = estacionamento.Pop();

                if (stringTemp == placaCarro)
                {
                    elementoEncontrado = true;
                }
                else
                {
                    stackTemp.Push(stringTemp);
                }
            }

            while (stackTemp.Count > 0)
            {
                string stringTemp = stackTemp.Pop();
                estacionamento.Push(stringTemp);
            }

            return elementoEncontrado;
        }
    }
}
