class CartaoEntity {
    public numero: string
    public validade: string
    public codigoSeguranca: number

    constructor(numero: string, validade: string, codigoSeguranca: number) {
        this.numero = numero
        this.validade = validade
        this.codigoSeguranca = codigoSeguranca
    }
}

export {
    CartaoEntity
}