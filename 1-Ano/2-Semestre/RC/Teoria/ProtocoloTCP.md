# Protocolo TCP

O **TCP (Transmission Control Protocol)** é um protocolo da **Camada de Transporte (Camada 4)** do modelo OSI. É a base para a maioria das aplicações que exigem fiabilidade e entrega garantida na Internet.

---

## 1. Características Fundamentais
* **Orientado à Ligação (Connection-oriented):** Estabelece uma sessão lógica (Handshake) antes de iniciar a transferência de dados.
* **Fiável (Reliable):** Garante que todos os dados chegam ao destino sem erros, sem duplicados e na ordem correta.
* **Controlo de Fluxo:** Utiliza o mecanismo de **Janela Deslizante (Sliding Window)** para evitar que o emissor sature o buffer do recetor.
* **Controlo de Congestionamento:** Monitoriza perdas na rede e reduz a taxa de envio se detetar "engarrafamentos" no percurso.
* **Full-Duplex:** Permite a transmissão e receção de dados em simultâneo no mesmo canal.

---

## 2. Estabelecimento de Ligação (Three-Way Handshake)
Este processo serve para sincronizar os números de sequência iniciais (**ISN**) entre cliente e servidor.

1. **SYN (Synchronize):** O cliente envia um pedido de ligação com um número de sequência aleatório.
2. **SYN-ACK (Synchronize-Acknowledgment):** O servidor confirma o pedido e envia o seu próprio pedido de sincronização.
3. **ACK (Acknowledgment):** O cliente confirma a receção do pedido do servidor. A ligação está estabelecida.



---

## 3. Estrutura do Cabeçalho TCP
O cabeçalho padrão tem **20 bytes** (tal como o IPv4). A Unidade de Dados (PDU) chama-se **Segmento**.

* **Source Port (16 bits):** Porta da aplicação no cliente (normalmente porta dinâmica).
* **Destination Port (16 bits):** Porta do serviço no servidor (porta bem conhecida, ex: 80, 443).
* **Sequence Number (32 bits):** Indica a posição do primeiro byte do segmento no fluxo total de dados.
* **Acknowledgment Number (32 bits):** Indica o próximo byte que o recetor espera receber (confirmação cumulativa).
* **Window Size (16 bits):** Quantidade de bytes que o recetor consegue aceitar no momento (Controlo de Fluxo).
* **Checksum (16 bits):** Verificação de erros do cabeçalho e dos dados.

---

## 4. Flags de Controlo (Bits de Controlo)
Estas flags definem o estado da ligação:

* **SYN:** Sincronização (usada apenas no estabelecimento).
* **ACK:** Indica que o campo de Confirmação é válido (usada em quase todos os pacotes após o primeiro SYN).
* **FIN:** Termina a ligação de forma controlada (Graciosa).
* **RST:** Aborta a ligação imediatamente (Reset) em caso de erro grave ou porta fechada.
* **PSH:** Pede para entregar os dados à aplicação imediatamente (Push).
* **URG:** Indica que existem dados urgentes no segmento.

---

## 5. Encerramento da Ligação (Four-Way Handshake)
O fecho é feito de forma independente em ambos os sentidos:
1. O emissor envia **FIN**.
2. O recetor responde com **ACK**.
3. O recetor (quando termina as suas tarefas) envia o seu próprio **FIN**.
4. O emissor responde com um **ACK** final.

---

## 6. TCP vs UDP

| Característica | TCP | UDP |
| :--- | :--- | :--- |
| **PDU** | Segmento | Datagrama |
| **Ligação** | Orientado à ligação | Sem ligação (Connectionless) |
| **Fiabilidade** | Sim (Retransmissão automática) | Não (Best-effort) |
| **Velocidade** | Mais lento (devido ao controlo) | Muito rápido (baixo overhead) |
| **Aplicações** | Web (HTTP), E-mail (SMTP), Ficheiros (FTP) | VoIP, Jogos Online, Streaming, DNS |



---

## 7. Portas Bem Conhecidas (Well-Known Ports)
As portas **0 a 1023** são reservadas para serviços padrão:

* **20/21:** FTP (Dados/Controlo)
* **22:** SSH (Acesso Remoto Seguro)
* **23:** Telnet (Inseguro)
* **25:** SMTP (Envio de E-mail)
* **53:** DNS (Nota: DNS usa UDP para consultas e TCP para transferências de zona)
* **80:** HTTP (Web insegura)
* **110:** POP3 (Receção de e-mail)
* **143:** IMAP (Sincronização de e-mail)
* **443:** HTTPS (Web segura)

---
**Nota:** O TCP garante a entrega ao nível do transporte, mas depende do protocolo **IP** (Camada 3) para fazer o encaminhamento dos pacotes entre as redes.
