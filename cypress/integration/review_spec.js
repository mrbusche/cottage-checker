describe('check cottages', () => {
    it('check cozy cottage vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111572');
        cy.contains('5 Reviews');
    })

    it('check cozy cottage vrbo', () => {
        cy.visit('https://www.vrbo.com/2111556');
        cy.contains('6 Reviews');
    })
})
