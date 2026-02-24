# O Modelo TCP/IP por Ordem 

Esta é a ordem de cima para baixo (do software para o hardware). No processo de envio, os dados descem esta pilha sofrendo **encapsulamento**. No recebimento, os dados sobem a pilha sofrendo **desencapsulamento**.

---

### 1. Camada de Aplicação (Application Layer)
É onde as aplicações de rede e os protocolos de utilizador residem.
* **Função:** Suportar aplicações de rede (Web, Email, Jogos).
* **Protocolos:** HTTP, SMTP, FTP, DNS.
* **PDU (Unidade de Dados):** Mensagem.

### 2. Camada de Transporte (Transport Layer)
Faz a transferência de dados entre processos (aplicações) nos sistemas finais.
* **Função:** Comunicação lógica entre processos. Oferece controlo de fluxo e correção de erros.
* **Protocolos:** TCP e UDP.
* **PDU (Unidade de Dados):** Segmento (se for TCP) ou Datagrama (se for UDP).

### 3. Camada de Rede (Network Layer)
Responsável por encaminhar os pacotes da origem até ao destino final através de diferentes redes.
* **Função:** Endereçamento lógico e roteamento (escolha do melhor caminho).
* **Protocolos:** IP (IPv4/IPv6), ICMP, protocolos de roteamento (BGP, OSPF).
* **PDU (Unidade de Dados):** Datagrama.

### 4. Camada de Enlace ou Link (Link Layer)
Responsável pela transferência de dados entre nós vizinhos (ex: do seu PC para o seu Router).
* **Função:** Transferência de dados num link específico; controlo de acesso ao meio.
* **Protocolos:** Ethernet, Wi-Fi (802.11), PPP.
* **PDU (Unidade de Dados):** Quadro (Frame).

### 5. Camada Física (Physical Layer)
Trata da transmissão dos bits individuais que compõem o quadro.
* **Função:** Transformar bits em sinais elétricos, pulsos de luz ou ondas de rádio.
* **Meios:** Cabos de cobre, Fibra ótica, Ar (espetro eletromagnético).
* **PDU (Unidade de Dados):** Bit.

---

## Resumo da Ordem de Encapsulamento:
**Mensagem** (Aplicação) → **Segmento** (Transporte) → **Datagrama** (Rede) → **Quadro** (Enlace) → **Bits** (Física)

Esta é a ordem de cima para baixo (do software para o hardware). No processo de envio, os dados descem esta pilha sofrendo **encapsulamento**. No recebimento, os dados sobem a pilha sofrendo **desencapsulamento**.

