function checkEmpty(params:any) {
    if(params === null || params === undefined || params === '') return true
    return false
}

function checkYearMonth(params:string) {
    const re = /^\d{4}\/(0[1-9]|1[0-2])$/
    return re.test(String(params));
}

export {
    checkEmpty,
    checkYearMonth
}
